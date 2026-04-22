class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Binary Search
        int L = 0;
        int R = matrix.length -1;
        boolean foundTarget = false;
        for(int i =0; i < matrix.length; i ++){
             int [] temparr = matrix[i];
             for(int y =0; y < temparr.length; y++){
                if(target == temparr[y]){
                    foundTarget = true;
                    break;
                }
             }
        }
        return foundTarget;
    }
}
