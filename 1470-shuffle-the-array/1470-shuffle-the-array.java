class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];
       int l = 0;
       int r = l+n;
       int idx = 0;
       while(idx < 2*n){
           arr[idx++] = nums[l];
           arr[idx++] = nums[r];
           l++;
           r++;
       }
        return arr;
    }
}