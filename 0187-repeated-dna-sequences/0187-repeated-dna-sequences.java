class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        if(s.length() < 10) return list;
        // int i=0;
         
       for(int i=0;i<s.length()-10+1;i++){
        StringBuilder str = new StringBuilder();
           for(int j=i;j<10+i;j++){
               str.append(s.charAt(j));
           }
           // System.out.println(str.toString());
           if(set.contains(str.toString()) && !list.contains(str.toString())){
               list.add(str.toString());
           }else{
               set.add(str.toString());
           }
       }
        // System.out.println("set " + set);
        // System.out.println("list " +  list);
        return list;
    }
}