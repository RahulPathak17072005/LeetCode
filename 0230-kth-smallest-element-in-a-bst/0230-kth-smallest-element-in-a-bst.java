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
    int cnt=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        solve(root,k);
        return ans;
        
    }
    private void solve(TreeNode node,int n){
        
        if(node==null) return;
        solve(node.left,n);
        cnt++;
        if(cnt==n){
            ans=node.val;
            return;
        }
        
        // System.out.println(node.val);
        solve(node.right,n);

        

    }
}