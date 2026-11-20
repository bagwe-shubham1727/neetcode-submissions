class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < pair.length; i++){
            double dist = target - pair[i][0];
            double movTime = dist/pair[i][1];
            if (stack.empty()){
                stack.push(movTime);
            }
            else {
                double top = stack.peek();
                if (!(movTime <= top)){
                    stack.push(movTime);
                }
            }
            
        }

        return stack.size();
    }
}
