class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
            }else{
                int diff = nums[i] - min;
                if(diff != 0 && diff > max) max = diff;
            }
        }
        return max;
    }
}