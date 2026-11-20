class MinStack {
    private Stack<Integer> stack;
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        if (!stack.empty()){
            stack.pop();
        }
        
    }
    
    public int top() {
        int top = 0;
        if (!stack.empty()){
            top = stack.peek();
        }
        
        return top;
    }
    
    public int getMin() {
        int min = stack.get(0);
        if (!stack.empty()){
            for (int i = 0; i < stack.size(); i ++){
                if (min > stack.get(i)){
                    min = stack.get(i);
                }
            }
        }
        return min;
    }
}
