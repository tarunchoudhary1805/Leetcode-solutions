class Solution {
    public String decodeMessage(String key, String message) {
        char ch = 'a';
         
        HashMap<Character,Character> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i)) && key.charAt(i) != ' '){
                // System.out.println(key.charAt(i) + " " + (char)(ch+count++));
                map.put(key.charAt(i),(char)(ch+count++));
            }
        }
        // for(Map.Entry<Character,Character> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + " / "+ entry.getValue());
        // }
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' '){
                s1.append(" ");
            }else{
                char c = map.get(message.charAt(i));
                s1.append(c);
            }
        }
        System.out.println(s1.toString());
        return s1.toString();
    }
}