class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        int a = 0;
        int b = 0;
        Stack<Integer> s = new Stack<>();
        for (int i=0; i < tokens.length; i++){
            switch (tokens[i]){
                case "+":
                {
                    a = s.pop();
                    b = s.pop();
                    res = a + b;
                    s.push(res);
                    break;
                }
                case "-":
                {
                    a = s.pop();
                    b = s.pop();
                    res = b - a;
                    s.push(res);
                    break;
                }
                case "*":
                {
                    a = s.pop();
                    b = s.pop();
                    res = a * b;
                    s.push(res);
                    break;
                }
                case "/":
                {
                    a = s.pop();
                    b = s.pop();
                    res = b / a;
                    s.push(res);
                    break;
                }
                default:
                {
                    s.push(Integer.parseInt(tokens[i]));
                    break;
                }
            }
    }
    return s.peek();
    }
}
