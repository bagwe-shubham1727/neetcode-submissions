class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        
        Stack<Integer> s = new Stack<>();
        for (int i=0; i < tokens.length; i++){
            if (!(tokens[i].equals("+")  || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))){
                s.push(Integer.parseInt(tokens[i]));
                System.out.println(s);
            }
            else if (tokens[i].equals("+")){
                int a = s.pop();
                System.out.println(s);
                int b = s.pop();
                System.out.println(s);
                res = a + b;
                s.push(res);
                System.out.println(s);
            }
            else if (tokens[i].equals("-")){
                int a = s.pop();
                int b = s.pop();
                res = b - a;
                s.push(res);
                System.out.println(s);
            }
            else if (tokens[i].equals("*")){
                int a = s.pop();
                int b = s.pop();
                res = a * b; 
                s.push(res);
                System.out.println(s);
            }
            else if (tokens[i].equals("/")){
                int a = s.pop();
                int b = s.pop();
                res = b / a;
                s.push(res);
                System.out.println(s);
            }
        }
        return s.peek();
    }
}
