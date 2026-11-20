class Solution {
    public void backTrack(int open, int close, int n, List<String> result, StringBuilder stack) {
            if (open == close && close == n){
                result.add(stack.toString());
                return;
            }

            if (open < n){
                stack.append("(");
                backTrack(open + 1, close, n, result, stack);
                stack.deleteCharAt(stack.length() - 1);
            }

            if (close < open){
                stack.append(")");
                backTrack(open, close + 1, n, result, stack);
                stack.deleteCharAt(stack.length() - 1);
            }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder stack = new StringBuilder();
        List<String> result = new ArrayList<>();

        
        backTrack(0,0,n, result, stack);
        return result;
    }
}
