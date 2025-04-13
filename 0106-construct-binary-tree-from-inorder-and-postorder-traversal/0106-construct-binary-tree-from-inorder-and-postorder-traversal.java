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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        return cTree(inorder,postorder,0,inorder.length-1);
    }
    private TreeNode cTree(int[] inorder,int[] postorder,int is,int ie){
        if(is > ie)
            return null;
        TreeNode root = new TreeNode(postorder[postIndex--]);
        int inIndex = 0;
        for(int i = is;is<=ie;i++){
            if(inorder[i] == root.val){
                inIndex = i;
                break;
            }
        }
        root.right = cTree(inorder,postorder,inIndex+1,ie);
        root.left = cTree(inorder,postorder,is,inIndex-1);
        return root;
    }
}