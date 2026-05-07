/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        //Going with inorder traversal
         inOrderTraversal(root, k);
         return result;
    }

    public void inOrderTraversal(TreeNode root, int k){
        if(root!=null){
            inOrderTraversal(root.left,k);
            count ++;
            if(count == k){
                result = root.val;
            }
            inOrderTraversal(root.right,k);
        }
    }
}
