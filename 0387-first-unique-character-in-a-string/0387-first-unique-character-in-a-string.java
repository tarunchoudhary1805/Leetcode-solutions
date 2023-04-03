class Solution {
    public int firstUniqChar(String s) {
      LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            }else{
                hm.put(s.charAt(i) , 1);
            }
        }
        char x = ' ';
        for(Map.Entry<Character, Integer> mapElement: hm.entrySet()){
            if(mapElement.getValue() == 1) {
                x = mapElement.getKey();
                break;
            }
        }
        return s.indexOf(x);
    }
}