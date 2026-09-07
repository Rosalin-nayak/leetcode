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
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val>val){
            root.left=deleteNode(root.left,val);
        }else if(root.val<val){
            root.right=deleteNode(root.right,val);
        }else{
            
            if(root.left==null && root.right==null) return null;
            
            if(root.left==null) return root.right;
            if(root.right==null)  return root.left;
            
            TreeNode pred=root.left;
            while(pred.right!=null) pred=pred.right;
            root.left=deleteNode(root.left,pred.val);
            pred.left=root.left;
            pred.right=root.right;
            return pred;
        }
        return root;
    }
}