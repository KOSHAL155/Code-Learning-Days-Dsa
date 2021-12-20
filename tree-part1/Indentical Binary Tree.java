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
    public int isSameTree(TreeNode A, TreeNode B) {
       int res= check(A,B);
       return res;
    }
    public int check(TreeNode a, TreeNode b){
        if(a==null&&b==null){
            return 1;
        }
        if ((a == null && b != null) || (a!= null && b == null)){ return 0;}
        if (a.val !=b.val){ return 0;}
      return Math.min(check(a.left,b.left),check(a.right,b.right));
    }
}
