class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> hmin = new HashMap<>();
        
        for(int i=0;i< words[0].length() ; i++){
            char c=words[0].charAt(i);
            hmin.put(c,hmin.getOrDefault(c,0)+1);  
        }
        for(int i=0;i<words.length;i++){
           HashMap<Character,Integer> hm = new HashMap<>();
           for(int j=0;j<words[i].length();j++){
               if(hm.containsKey(words[i].charAt(j))){
                   hm.put(words[i].charAt(j),hm.get(words[i].charAt(j))+1);
               }else{
                   hm.put(words[i].charAt(j),1);
               }
           }
            for(Character x : hmin.keySet()){
                if(hm.containsKey(x)){
                    hmin.put(x,Math.min(hmin.get(x),hm.get(x)));
                }else{
                    hmin.put(x,0);
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(Character x:hmin.keySet()){
            if(hmin.get(x) > 0){
                for(int i=0;i<hmin.get(x);i++){
                    list.add(x+"");
                }
            }
        }
        System.out.println(hmin);
        return list;
        
    }
}