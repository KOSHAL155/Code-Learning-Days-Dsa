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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<>();
         pretravel(A,res);
         return res;
    }
    public void pretravel(TreeNode A,ArrayList<Integer> l){
        if(A==null){
            return;
        }
        l.add(A.val);
        pretravel(A.left,l);
        pretravel(A.right,l);
    }
}
