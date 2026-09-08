class Solution {
    public int countCommas(int n) {
        int res = 1;
        if(n<1000){
            return 0;
        }
        while(n>1000){
            res++;
            n--;
        }
        return res;
    }
}