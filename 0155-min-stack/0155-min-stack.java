class MinStack {
ArrayList<Integer> list = new ArrayList<>();
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
      if(list.size() != 0){
          list.remove(list.size()-1);
      }        
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
         if(list.get(i) < min){
             min = list.get(i);
         }   
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */