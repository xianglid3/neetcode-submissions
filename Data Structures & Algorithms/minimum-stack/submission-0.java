class MinStack {

    //st:  1, 2, 0, 1

    //min: 1, 1, 0, 0


    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
       
    }
    
    public void push(int val) {        
        st.push(val);


        //add to min stack
        if(min.isEmpty()){
            min.push(val); 
        
        } else {

        
            if(val <= min.peek()){
                min.push(val);
            }else{
                min.push(min.peek());
            }
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
