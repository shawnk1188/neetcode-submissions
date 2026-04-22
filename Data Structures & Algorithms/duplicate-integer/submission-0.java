class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> removeDuplicates = new TreeSet<>(Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toList()));
        if(removeDuplicates.size() == nums.length){
            return false;
        }else{
            return true;
        }
    }
}