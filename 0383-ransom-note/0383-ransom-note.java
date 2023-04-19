class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         System.out.println(map);
        for(int i=0;i<ransomNote.length();i++){
        char ch = ransomNote.charAt(i);
            if(map.get(ch) != null && map.get(ch) > 0){
                map.put(ch,map.getOrDefault(ch,0)-1);
            }else{
                return false;
            }
            System.out.println(map);
        }
        return true;
    }
}