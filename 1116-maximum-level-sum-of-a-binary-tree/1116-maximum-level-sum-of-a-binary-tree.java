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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int curr_level = 1;
        int max_sum=Integer.MIN_VALUE;
        int res = 0;
        while(!q.isEmpty()){
            int sum = 0;
            int l = q.size();
            for(int i=0;i<l;i++){
                TreeNode node = q.poll();
                sum += node.val;

                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            if(max_sum<sum){
                max_sum = sum;
                res = curr_level;
            }
            curr_level++;
        }
        return res;
    }
}