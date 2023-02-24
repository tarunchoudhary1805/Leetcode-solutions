class Solution {
    public boolean uniqueOccurrences(int[] nums) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.print(map.values());
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}