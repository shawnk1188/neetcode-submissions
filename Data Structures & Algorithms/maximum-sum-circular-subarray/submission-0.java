class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        int globalMin = nums[0];
        int currMin = 0;
        int total = 0;

        for(int i =0; i < nums.length ; i ++){
            if(currSum < 0){
                currSum = 0;
            }
            currMin = currMin + nums[i];
            currMin = Math.min(currMin,nums[i]);
            globalMin = Math.min(currMin,globalMin);
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum,currSum);
            total = total + nums[i];
        }
        if(maxSum > 0){
            return Math.max(maxSum, total - globalMin);
        }
        return maxSum ;
    }
}