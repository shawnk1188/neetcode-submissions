class Solution {
    public int removeDuplicates(int[] nums) {
        //Converting it to list
     // Convert int[] to List<Integer> using streams
        List<Integer> integerList = Arrays.stream(nums) // Creates an IntStream
                                        .boxed()           // Converts IntStream to Stream<Integer> (boxes int to Integer)
                                        .collect(Collectors.toList()); // Collects elements into a List
        Set<Integer> removeDuplicates = new TreeSet<>(integerList);

        System.out.println("Testing:" + removeDuplicates);
        int i = 0;
        for (int num : removeDuplicates) {
            nums[i++] = num;
        }
        return removeDuplicates.size();
    }
}