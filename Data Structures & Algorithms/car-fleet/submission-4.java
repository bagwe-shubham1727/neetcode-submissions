class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        
        Stack<Float> stack = new Stack<>();

        for (int i = 0; i < pair.length; i++){
            float dist = target - pair[i][0];
            float movTime = dist/pair[i][1];
            if (stack.empty()){
                stack.push(movTime);
            }
            else {
                float top = stack.peek();
                if (!(movTime <= top)){
                    stack.push(movTime);
                }
            }
            
        }

        return stack.size();
    }
}
