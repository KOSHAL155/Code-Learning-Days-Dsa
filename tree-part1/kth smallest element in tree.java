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
    public int kthsmallest(TreeNode A, int B) {
      ArrayList <Integer> r= new ArrayList<>();
      checksmall(A,r);
      int res=r.get(B-1);
      return res;
    }
    public void checksmall(TreeNode a,ArrayList<Integer> b){
        if(a==null){
            return ;
        }

        checksmall(a.left,b);
        b.add(a.val);
        checksmall(a.right,b);

    }
}
