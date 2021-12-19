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
    public int isSymmetric(TreeNode A) {
        boolean res=checkval(A,A);
     if(res==false){
        return 0;
        
    }
    return 1;
    }
    public boolean checkval(TreeNode a,TreeNode b){
        if(a==null&&b==null){
            return true;
        }
        if(a!=null&&b!=null&&a.val==b.val){
        return (checkval(a.left,b.right)&&checkval(a.right,b.left));

        }
        
        return false;
    }
}
