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
    public int lca(TreeNode A, int B, int C) {
    //check if our b and c exist or not
        if(check(A,B)==false||check(A,C)==false){
            return -1;
        }
      //finding common ancestor 
        int res=findroot(A,B,C).val;
        return res;
    
    }
  //creating check function your value exist or not
    public boolean check(TreeNode A,int v){
        if(A==null){
            return false;
        }if(A.val==v){
            return true;
        }   
        return check(A.left,v)||check(A.right,v);
        }
  // checking lowest common  ancestor root node
    public TreeNode findroot(TreeNode A,int B,int C){
        if(A==null){
            return null;
        }
      //condition to return node to lowest 
        if(A.val==B||A.val==C){
            return A;
        }
     // finding left and right root node and them lowest common
        TreeNode l=findroot(A.left,B,C);
        TreeNode r=findroot(A.right,B,C);
        if(l!=null&&r!=null){
            return A;
        }
        if(l!=null){return l;}
        if(r!=null){return r;}
     //if it does n't find anything then return null
        return null;
    }
}
