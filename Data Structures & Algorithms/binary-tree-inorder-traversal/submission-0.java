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
        List<Integer> inOrder = new ArrayList<>();
        traversal(root,inOrder);
        return inOrder;
    }
    public TreeNode traversal(TreeNode root, List<Integer> list){
        if(root == null){
            return root;
        }
        traversal(root.left,list);
        list.add(root.val);
        traversal(root.right,list);
        return root;
    }
}