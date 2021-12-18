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
    public ArrayList<Integer> recoverTree(TreeNode A) {
       ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        inorder(inorder,A);
        ArrayList <Integer> sorted=new ArrayList<>(inorder);
        Collections.sort(sorted);
        int i=0;
        for(int n:sorted){
            if(inorder.get(i)!=n){
                res.add(n);
            }
            i++;
        }
       
        return res;
    }
    public void inorder(ArrayList<Integer> in,TreeNode A){
        if(A==null){
            return;
        }
        inorder(in,A.left);
        in.add(A.val);
        inorder(in,A.right);
    }

}
