class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
            
                if (!stk.isEmpty()) {
                    sb.append(c);
                }
                stk.push(c);
            } else if (c == ')') {
                
                stk.pop();
                
                if (!stk.isEmpty()) {
                    sb.append(c);
                }
            }
        }
        
        return sb.toString(); 
    }
}