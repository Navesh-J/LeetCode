class StockSpanner {
    private Stack<Integer> stack;
    private int index;
    private int[] prices ;
    public StockSpanner() {
        stack = new Stack<>();
        index=-1;
        prices=new int[100000];
    }
    
    public int next(int price) {
        index++;
        prices[index]=price;
        while(!stack.isEmpty() && prices[stack.peek()] <= price){
            stack.pop();
        }
        int span=stack.isEmpty()?(index+1):index-stack.peek();
        stack.push(index);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */