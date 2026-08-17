class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(char current:num.toCharArray()){
            while(!stk.isEmpty() && k>0 && stk.peek()>current){
                stk.pop();
                k--;
            }
            stk.push(current);
        }
        while(k>0){
            stk.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        boolean leadingZero = true;
        for (char c : stk) {
        
            if (leadingZero && c == '0') {
                continue;
            }
            leadingZero = false;
            str.append(c);
        }
        return str.length() == 0 ? "0" : str.toString();
    }

}