class Solution {
    public int triangularSum(int[] nums) {
        int [] res = sumTriangleFromArray(nums);
        return res[0];
    }
    public static int [] sumTriangleFromArray(int[] arr){
     
          if(arr.length == 1) return arr;
          int [] a = new int[arr.length-1];
          for(int i=1;i<arr.length;i++){
              a[i-1] = (arr[i-1]  + arr[i]) % 10;
              
          }
       
         return  sumTriangleFromArray(a);
        
    }
}