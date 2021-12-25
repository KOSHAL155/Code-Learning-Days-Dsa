//interview bit solution java merge two binary tree
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public TreeNode solve(TreeNode A, TreeNode B) {
        merge(A,B);
        return A;
    }
    public TreeNode merge(TreeNode t1,TreeNode t2){
         if (t1 == null)
             return t2;
         if (t2 == null)
             return t1;
         t1.val += t2.val;
         t1.left = merge(t1.left, t2.left);
         t1.right = merge(t1.right, t2.right);
         return t1;
     }
      
}
