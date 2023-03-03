class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<num.length();i++){
            int n = (int)(num.charAt(i)-'0');
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        System.out.println(map);
        for(int i=0;i<num.length();i++){
            int c = (int)(num.charAt(i)-'0');
            if(map.containsKey(i)){
                 if(map.get(i) != c) return false;
            }else{
                if(c>0)
                    return false;
            }
            // System.out.println(map.get(i));
           
        }
        return true;
    }
}