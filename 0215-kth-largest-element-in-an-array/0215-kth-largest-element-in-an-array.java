class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            pq.offer(nums[i]);
            
        }
        // int [] arr1 = new int[k];
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
    }
}