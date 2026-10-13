class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        long curSum =0 ;
        long maxSum =0;
        int j =0;
        for(int i = 0; i<nums.length; i++){
            while(set.contains(nums[i])|| set.size()==k){
                set.remove(nums[j]);
                curSum -= nums[j];
                j++;

            }
            curSum+=nums[i];
            set.add(nums[i]);
            if(set.size()==k){
                maxSum = Math.max(curSum , maxSum);
            }

        }
        return maxSum;
        
    }
}