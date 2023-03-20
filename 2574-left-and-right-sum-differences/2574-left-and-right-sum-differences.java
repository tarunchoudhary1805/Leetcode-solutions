class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int [] ans = new int[nums.length];
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int val = sum;
        for(int i=0;i<nums.length;i++){
            right[i] = val - nums[i];
            val = val-nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            left[i] = sum - nums[i];
            sum = sum-nums[i];
        }
        for(int i=0;i<ans.length;i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        // System.out.println(Arrays.toString(left));
        
        // System.out.println(Arrays.toString(right));
        return ans;
    }
}