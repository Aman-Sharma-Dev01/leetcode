class Solution {
    public boolean isHappy(int n) {
        int slow = sq(n);
        int fast = sq(sq(n));
        while(slow != fast){
            slow = sq(slow);
            fast = sq(sq(fast));
        }
        return slow ==1;
    }
    public int sq(int num){
        int ans = 0;        
        while(num != 0){
            int temp =0;
            temp = num%10;
            temp = temp*temp;
            num = num/10;
            ans += temp;
        }
        return ans;
    }
}