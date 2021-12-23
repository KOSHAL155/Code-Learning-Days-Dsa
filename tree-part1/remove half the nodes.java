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
    public TreeNode solve(TreeNode A) {
       return remove(A);
        
    }

 public TreeNode remove(TreeNode a){
     if(a==null){
         return a;
     }
    a.left=remove(a.left);
    a.right=remove(a.right);
     if(a.left==null&&a.right==null){
            return a;}
     if(a.left==null){TreeNode new_root = a.right;
            return new_root;}
     if(a.right==null){TreeNode new_root = a.left;
            return new_root;}
            
   return a; 
 }
}
