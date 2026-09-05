
//        // 4,3,2,7,8,2,3,1 ->>> 1,2,2,3,3,4,7,8
   
 class Solution {
     public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> list = new ArrayList<>();
         HashSet<Integer> set = new HashSet<>();
         int n=nums.length;
         for (int num : nums) {
             set.add(num);
         }
         for (int i = 1; i <= n; i++) {
             if (!set.contains(i)) {
                 list.add(i);
             }
       }
         Collections.reverse(list);
         Collections.reverse(list); 
         return list;
     }
}