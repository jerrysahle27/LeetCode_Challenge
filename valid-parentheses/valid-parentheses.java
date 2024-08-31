class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        if(s.length() == 1){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(Character.toString(s.charAt(i)));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek().charAt(0);
                System.out.println(top);
                if (s.charAt(i) == ')' && top == '(') {
                    stack.pop();
                } else if (s.charAt(i) == '}' && top == '{') {
                    stack.pop();
                } else if (s.charAt(i) == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}