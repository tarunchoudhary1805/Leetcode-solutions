class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] ans = new int[queries.length];
        int[] pref = new int[n];
        int m=words[0].length();
        if((words[0].charAt(0)=='a' || words[0].charAt(0)=='e' || words[0].charAt(0)=='i' || words[0].charAt(0)=='o' || words[0].charAt(0)=='u')){
        if((words[0].charAt(m-1)=='a' || words[0].charAt(m-1)=='e' || words[0].charAt(m-1)=='i' || words[0].charAt(m-1)=='o' || words[0].charAt(m-1)=='u')){
        pref[0]=1;
        }
        }
        for(int i=1;i<n;i++){
        if((words[i].charAt(0)=='a' || words[i].charAt(0)=='e' || words[i].charAt(0)=='i' || words[i].charAt(0)=='o' || words[i].charAt(0)=='u')){
        m=words[i].length();
        if((words[i].charAt(m-1)=='a' || words[i].charAt(m-1)=='e' || words[i].charAt(m-1)=='i' || words[i].charAt(m-1)=='o' || words[i].charAt(m-1)=='u')){
        pref[i]=pref[i-1] + 1;
        }
        else pref[i]=pref[i-1];
        }
        else pref[i]=pref[i-1];
        }
        for(int i=0;i<queries.length;i++){
        int x=queries[i][0];
        int y=queries[i][1];
        if(x==0){
        ans[i] = pref[y];
        }
        else ans[i] = pref[y]-pref[x - 1];
        }
        return ans;
}
}