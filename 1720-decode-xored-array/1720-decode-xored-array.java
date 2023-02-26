class Solution {
    public int[] decode(int[] encoded, int first) {
        int [] arr = new int[encoded.length + 1];
        arr[0] = first;
        int count = 1;
        for(int i=0;i<encoded.length;i++){
            int ans = arr[i] ^ encoded[i];
            arr[count] = ans;
            count++;
        }
        return arr;
    }
}