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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversalList = new ArrayList<>();
        traversalList = traversal(root,traversalList);
        return traversalList;
    }

    public List<Integer> traversal(TreeNode root, List<Integer> traversalList){
        if(root!= null){
            traversal(root.left,traversalList);
            traversalList.add(root.val);
            traversal(root.right,traversalList);
        }
        return traversalList;
    }
}