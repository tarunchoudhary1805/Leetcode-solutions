class Solution {
    public void reverseString(char[] s) {
        rec(s);
    }
    public static void rec(char[]s){
        if(s.length == 0) return ;
        int i=0;
        int j=s.length-1;
        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}