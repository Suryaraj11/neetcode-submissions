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
    TreeNode commonNode;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return commonNode;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q)
    {
        boolean trueP = false;
        boolean trueQ = false;
        if(root.left!=null)trueP = dfs(root.left,p,q);
        if(root.right!=null)trueQ = dfs(root.right,p,q);
        if((trueP && trueQ) || ((root.val==p.val || root.val==q.val) && (trueP || trueQ)))
        commonNode = root;
        return trueP || trueQ || root.val==p.val || root.val==q.val;
    }
}
