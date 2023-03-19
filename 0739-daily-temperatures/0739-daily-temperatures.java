class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int arr []  = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && (temp[i] > temp[s.peek()])){
                int idx =  s.pop();
                arr[idx] = i - idx; 
            }
            s.push(i);
        }
        return arr;
        
    }
}