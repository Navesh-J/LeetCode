class MinStack {
    public Stack<Integer> as=new Stack<>();
    public Stack<Integer> ms=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        ms.push(val);
        if(as.isEmpty() || val <= as.peek())
            as.push(val);
    }
    
    public void pop() {
        if(ms.peek().equals(as.peek()))
            as.pop();
        ms.pop();
    }
    
    public int top() {
        return ms.peek();
    }
    
    public int getMin() {
        return as.peek();
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