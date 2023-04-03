class Solution {
    public char repeatedCharacter(String s) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
                return s.charAt(i);
            }else{
                hm.put(s.charAt(i) , 1);
            }
        }
         
        return ' ';
    }
}