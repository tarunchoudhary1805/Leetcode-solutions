class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<emails.length;i++){
        StringBuilder s = new StringBuilder();
            System.out.println(s.toString());
            String[] xs = emails[i].split("@");
            for(int j=0;j<xs[0].length();j++){
                 
                    if(xs[0].charAt(j) == '.'){
                        continue;
                    }else if(xs[0].charAt(j) == '+'){
                        break;
                    }else{
                        s.append(xs[0].charAt(j));
                    }
                
            }
            s.append("@");
            s.append(xs[xs.length - 1]);
            System.out.println(s.toString());
            set.add(s.toString());
        }
        return set.size();
    }
}