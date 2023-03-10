class Solution {
    public char findTheDifference(String s, String t) {
        String x = s+t;
        char ans = x.charAt(0);
        
        for(int i=1;i<x.length();i++){
            ans ^= x.charAt(i);
        }
        return ans;
    }
}