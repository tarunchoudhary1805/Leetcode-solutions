class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder n = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()) n.append(word1.charAt(i));
            if(i<word2.length()) n.append(word2.charAt(i));
            i++;
        }
        return n.toString();
    }
}