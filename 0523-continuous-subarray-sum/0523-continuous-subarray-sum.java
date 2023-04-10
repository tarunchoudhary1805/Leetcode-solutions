class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int prefixSumMode = prefixSum % k;
            if(prefixSumMode == 0 && i+1 >= 2) return true;
            if(map.containsKey(prefixSumMode)){ 
                if((i - map.get(prefixSumMode)) >= 2){
                   return true;
                }
            }else{
                map.put(prefixSumMode,i);
            }
        }
        return false;
    }
}