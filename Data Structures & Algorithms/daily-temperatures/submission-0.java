class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] array = new int[temperatures.length];
        Stack <int[]> stack = new Stack<>();

        for(int x = 0; x < temperatures.length; x++){
            int t = temperatures[x];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                array[pair[1]] = x - pair[1];
            }
            stack.push(new int[]{t, x});
        }

        return array;
    }
}
