class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int arraySize = temperatures.length;
        int[] result = new int[arraySize];
        
        for (int i = 0; i < temperatures.length; i++){
            int count = 0;
            int nextDay = i + 1;
            while (nextDay < temperatures.length){
                if (temperatures[i] < temperatures[nextDay]){
                    count = nextDay - i;
                    break;
                }
                nextDay++;
            }
            
            stack.push(count);
        }

        int i = result.length - 1;
        while (!stack.isEmpty()) {
            result[i] = stack.pop();
            i--;
        }
        return result;
    }
}
