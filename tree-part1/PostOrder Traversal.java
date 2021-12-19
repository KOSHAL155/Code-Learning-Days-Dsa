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
    public int[] postorderTraversal(TreeNode A) {
        ArrayList<Integer> r=new ArrayList<>();
        post(A,r);
        int[] res=new int[r.size()];
        for(int i=0;i<r.size();i++){
            res[i]=r.get(i);
        }
        return res;
    }
    public void post(TreeNode a,ArrayList<Integer> r){
        if(a==null){
            return;
        }
        post(a.left,r);
        post(a.right,r);
        r.add(a.val);
    }
}
