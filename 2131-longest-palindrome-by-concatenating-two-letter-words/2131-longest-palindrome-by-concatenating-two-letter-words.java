class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int len = 0;
        for(int  i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else{
                
            map.put(words[i],1);
            }
        }
        for(Map.Entry m : map.entrySet()){
            String ans = (String)m.getKey();
            String rev = reverseString((String)m.getKey());
            // System.out.println(ans + " " + rev);
            if(map.containsKey(rev)){
                if(rev.equals(ans)){
                    int y=map.get(rev);
                    if(y%2!=0)
                        y--;
                    len+=(2*y);
                    map.put(rev,map.get(rev)-y); 
                }else{
                    
                    
                    int a = Math.min((int) map.get(ans),(int) map.get(rev));
                    len += (4*a);
                    map.put(ans,map.get(ans)-a);
                    map.put(rev,map.get(rev)-a);
                }
            }
        }
        for(Map.Entry m : map.entrySet()){
             String key=(String)m.getKey();
            int val=(int)m.getValue();
            if(key.charAt(0)==key.charAt(1) && val>0)
            {
                len+=2;
                break;
            }
        }
        System.out.println(map + " " + len);
        return len;
    }
    public static String reverseString(String x){
        StringBuilder xx = new StringBuilder();
        for(int i=1;i>=0;i--){
         xx.append(x.charAt(i));
        }
        return xx.toString();
    }
}