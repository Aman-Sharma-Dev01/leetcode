class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int i =0;
        int j = n-1;
        int res[] = new int[2];
        while(i<j){
            if(arr[i] +arr[j] == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }else if(arr[i] +arr[j] < target){
                i++;
            }else if(arr[i] +arr[j] > target){
                j--;
            }
        }
        return res;

    }
}