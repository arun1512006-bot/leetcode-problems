class KthLargest {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            }
            else {
                pq.offer(num);
                pq.poll();
            }
        }
    }
    public int add(int val) {
        if (pq.size() < k) {
            pq.offer(val);
        }
        else {
            pq.offer(val);
            pq.poll();
        }
        return pq.peek();
    }
}