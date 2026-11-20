class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++){
            int width = 1;
            int area = 0;
            int rPointer = i + 1;
            int lPointer = i - 1;

            while ((rPointer < heights.length) && (heights[i] <= heights[rPointer])){
                width = width + 1;
                rPointer ++;
            }

            while ((lPointer >= 0) && (heights[i] <= heights[lPointer])){
                width = width + 1;
                lPointer --;
            }

            area = heights[i] * width;

            if (stack.empty()){
                stack.push(area);
            }
            else if (stack.peek() < area) {
                stack.pop();
                stack.push(area);
            }
        }
        return stack.peek();
    }
}
