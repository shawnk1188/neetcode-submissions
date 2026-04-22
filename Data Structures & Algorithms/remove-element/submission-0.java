class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> reducedList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                reducedList.add(nums[i]);
            }
        }
        int y =0;
        for(Integer num: reducedList){
            nums[y] = num;
            y++;
        }
        return reducedList.size();
    }
}