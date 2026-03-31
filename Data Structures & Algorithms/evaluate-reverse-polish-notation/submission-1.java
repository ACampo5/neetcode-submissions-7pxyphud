class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        // for(String s : tokens){
        //     if("+-*/".contains(s) && s.length() == 1){
        //         int b = stack.pop();
        //         int a = stack.pop();

        //         switch(s){
        //             case "+":
        //                 stack.push(a+b);
        //                 break;
        //             case "-":
        //                 stack.push(a-b);
        //                 break;
        //             case "*":
        //                 stack.push(a*b);
        //                 break;
        //             case "/":
        //                 stack.push(a/b);
        //                 break;
        //         } 

        //     } else {
        //         stack.push(Integer.valueOf(s));
        //     }
        // }
        // return stack.pop();
        
        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();

    }
}
