class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map = new HashMap();
        for(int i=0;i<words[0].length();i++){
            map.put(words[0].charAt(i),map.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> hm = new HashMap();
            for(int j=0;j<words[i].length();j++){
              hm.put(words[i].charAt(j),hm.getOrDefault(words[i].charAt(j),0)+1);
            }
            
            for(Character x : map.keySet()){
                if(hm.containsKey(x)){
                    map.put(x,Math.min(hm.get(x),map.get(x)));
                }else{
                    map.put(x,0);
                }
            }
        }
        ArrayList<String> list = new ArrayList<>();
        System.out.println(map);
        for(Character x : map.keySet()){
           if(map.get(x) > 0){
               for(int i=0;i<map.get(x);i++){
                   list.add(x+"");
               }
                
           }
        }
        return list;
    }
}