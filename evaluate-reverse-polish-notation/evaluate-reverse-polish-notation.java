class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        int result = 0;
        for (String num : tokens) {
            if (!num.equals("+") && !num.equals("-") && !num.equals("*") && !num.equals("/")) {
                stack[++top] = Integer.parseInt(num);
            } else {
                int a = stack[top];
                top--;
                int b = stack[top];
                top--;
                switch (num) {
                    case "+": {
                        stack[++top] = a + b;
                        break;
                    }
                    case "*": {
                        stack[++top] = a * b;
                        break;
                    }
                    case "/": {
                        stack[++top] = b / a;
                        break;
                    }
                    case "-": {
                        stack[++top] = b -a;
                        break;
                    }
                }
            }
        }
        return stack[top];
    }
}