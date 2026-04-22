class Solution {
    public int removeElement(int[] nums, int val) {
        int R = 0;
        for(int i =0; i< nums.length; i ++){
            if(nums[i] != val ){
                nums[R] = nums[i];
                R++;
            }
        }
        return R;
    }
}