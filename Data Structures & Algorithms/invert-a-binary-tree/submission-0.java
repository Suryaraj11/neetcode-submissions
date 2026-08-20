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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            if(node==null)continue;
            TreeNode tempNode = null;
            if(node.right!=null)tempNode = node.right;
            node.right = node.left;
            node.left = tempNode;
            if(node.right!=null)q.offer(node.right);
            if(node.left!=null)q.offer(node.left);
        }
        return root;
    }
}
