class Solution {
    public int missingNumber(int[] array) {
         // Your code goes here
        //  using sum of n terms 
        //  at the end the number will remain alone which is not in the array
        //  int ans = nums.length * (nums.length + 1) /2;
        //  for(int i=0;i<nums.length;i++){
        //      ans -= nums[i];
        //  }
        //  return ans;

        //    Solution 2 : Using Bitwise XOR operator
        // in this we first XOR all the elements given by array
        // after that we XOR all numbers from 1 to n
        // then XOR both XOR's results
        int n= array.length;
        int x1 = array[0];
        int x2 = 0;
        for(int i=1;i<n;i++){
            x1 = x1^ array[i];
        }
        for(int i=1;i<=n;i++){
            x2 = x2^ i;
        }
        return x1^x2;
    }
}