class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minStack.empty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int pop = 0;
        if (!stack.empty()){
           pop = stack.pop();
        }
        if ((!minStack.empty()) && pop == minStack.peek()){
            minStack.pop();
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
        return minStack.peek();
    }
}
