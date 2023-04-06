class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
         
        for(int i=0;i<nums.length;i++){
            int s1 = nums[i]+k;
            int s2 = nums[i]-k;
            if(map.containsKey(s1)){
                count += map.get(s1);
            }
            if(map.containsKey(s2)){
                count += map.get(s2);
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        return count;
    }
}