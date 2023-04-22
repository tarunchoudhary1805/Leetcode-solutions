class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int l = 0;
        int j = n-1;
        int index = n-1;
        while(l <= j ){
             
            int left = Math.abs(nums[l] * nums[l]);
            int right = Math.abs(nums[j] * nums[j]);
            
            if(left > right){
                arr[index] = left;
                l++;
                
            }else {
                arr[index] = right;
                j--;
            } 
            index--;
        }
System.out.println(Arrays.toString(arr));
        return arr;
    }
}