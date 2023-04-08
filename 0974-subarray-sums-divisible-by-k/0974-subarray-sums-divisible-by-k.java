class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            int temp = prefixSum % k;
            if(temp < 0) temp = temp+k;
            if(map.containsKey(temp)){
                count+=map.get(temp);
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        return count;
    }
}