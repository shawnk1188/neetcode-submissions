class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int fixedLength = 2 * length;
        int[] ans = new int[fixedLength];
        for(int i =0; i <length;i++){
            ans[i] = nums[i];
            ans[length + i] = nums[i];
        }
        return ans;
    }
}