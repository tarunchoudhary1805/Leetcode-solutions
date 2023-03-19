class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+")&& !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                // System.out.println(tokens[i]);
                int ans = Integer.valueOf(tokens[i]);
                s.push(ans);
            }else{
                if(tokens[i].equals("+")){
                    int ans1 = s.pop();
                    int ans2 = s.pop();
                    int res = ans2+ans1;
                    s.push(res);
                }else if(tokens[i].equals("-")){
                    int ans1 = s.pop();
                    int ans2 = s.pop();
                    int res = ans2-ans1;
                    s.push(res);
                }else if(tokens[i].equals("*")){
                    int ans1 = s.pop();
                    int ans2 = s.pop();
                    int res = ans2*ans1;
                    s.push(res);
                }else if(tokens[i].equals("/")){
                    int ans1 = s.pop();
                    int ans2 = s.pop();
                    int res = ans2/ans1;
                    s.push(res);
                }
            }
        }
        System.out.println(s);
        return s.peek();
    }
}