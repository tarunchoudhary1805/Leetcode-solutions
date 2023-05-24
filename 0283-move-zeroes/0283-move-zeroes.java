class Solution {
    public void moveZeroes(int[] arr) {
     int i=0;
     int j = 1;
        while(i < arr.length && j < arr.length){
            if(arr[i] != 0){
                i++;
                j++;
            }else if(arr[i] == 0){
                if(arr[j] == 0){
                    j++;
                }else{
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  temp;
                }
            }
        }
    }
}