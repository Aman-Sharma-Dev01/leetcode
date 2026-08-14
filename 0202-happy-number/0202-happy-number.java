class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            int sum = 0;
            int temp = n;
            while(temp != 0){
                int digit = temp % 10;
                sum += Math.pow(digit, 2);
                temp= temp/10;
            }

            n = sum;
        } 
        return n == 1;
    }
}