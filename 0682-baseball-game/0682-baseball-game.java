class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        // int sum = 
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }else if(operations[i].equals("D")){
                int res = list.get(list.size()-1);
                res = res*2;
                list.add(res);
            }else if(operations[i].equals("+")){
                int res1 = list.get(list.size()-1);
                int res2 = list.get(list.size()-2);
                int sum   = res1+res2;
                list.add(sum);
            }else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        int ans = 0;
        for(int i=0;i<list.size();i++){
             ans += list.get(i);
        }
        return ans;
    }
}