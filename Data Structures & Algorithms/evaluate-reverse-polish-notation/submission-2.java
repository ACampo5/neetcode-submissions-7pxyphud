class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){
            if("+-*/".contains(s) && s.length() == 1){
                int b = stack.pop();
                int a = stack.pop();

                switch(s){
                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                } 

            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
        

    }
}
