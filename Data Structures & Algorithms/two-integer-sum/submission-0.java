class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        int[] val = new int[2];
        for(int i =0; i< nums.length;i++){
            if(indexMap.containsKey(nums[i])){
                val[0] = indexMap.get(nums[i]);
                val[1] = i;
            }
            indexMap.put(target - nums[i],i);
        }
        return val;
    }
}
