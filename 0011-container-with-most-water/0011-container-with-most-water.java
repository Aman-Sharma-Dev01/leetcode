class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int k = 0;

        while(left < right){
            int res = Math.min(arr[left], arr[right])*(right-left);
            k = Math.max(k , res);
            if(arr[left]<=arr[right]){
                left++;
            }else right--;

        }
        return k;
    }
}