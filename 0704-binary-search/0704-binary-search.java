class Solution {
    public int search(int[] nums, int target) {
      int res = BinarySearch(nums,0,nums.length-1,target);
        return res;
    }
    public static int BinarySearch(int [] arr , int start , int end, int target){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) return BinarySearch(arr, start , mid - 1, target);
        return BinarySearch(arr, mid+1 , end, target);
    }
}