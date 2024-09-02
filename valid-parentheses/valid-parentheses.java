class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        if(s.length() == 1){
             return false;
         }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack[++top] = s.charAt(i);
            }
            else  {
                if(top == -1){
                    top++;
                    return false;
                }
                if (s.charAt(i) == ')' && stack[top] == '(') {
                      top--;
                } else if (s.charAt(i) == '}' && stack[top] == '{') {
                       top--;
                } else if (s.charAt(i) == ']' && stack[top] == '[') {
                       top--;
                } else {
                    return false;
                }
            }
        }
        if(top == -1){
            return true;
        }
        return false;
    }
}
