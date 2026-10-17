class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> hm = new HashMap<>();
        List<String> l = new ArrayList<>();
        for(String s:banned){
            l.add(s);
        }
        String[] arr = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]"," ").split("\\s+");
        for(String s:arr){
            if(!l.contains(s)){
                System.out.println(s);
                hm.put(s,hm.getOrDefault(s,0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        String w = "";
        for(String s:hm.keySet()){
            int f = hm.get(s);
            System.out.println("word: "+s+" freq: "+f);
            if(f>max){
                max = f;
                w = s;
            }
        }
        return w;
    }
}