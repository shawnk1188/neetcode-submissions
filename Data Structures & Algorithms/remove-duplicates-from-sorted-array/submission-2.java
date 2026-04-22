class Solution {
    public int removeDuplicates(int[] nums) {
        // two pointer solution
        int R = 1;
        for(int i=0; i < nums.length; i ++){
            if(i + 1 < nums.length){
            if(nums[i] != nums[i+ 1]){
                nums[R] = nums[i + 1];
                R++;
            }
            }
      
        }
        return R;
    }
}