class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i !=j && target.equals(nums[i]+nums[j]) == true){
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        return count;
    }
}