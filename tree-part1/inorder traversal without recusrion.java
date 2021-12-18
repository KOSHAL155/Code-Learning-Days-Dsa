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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<TreeNode> st= new Stack<>();

        while(A!=null){
            st.push(A);
            A=A.left;
        }
        while(!st.isEmpty()){
            TreeNode remove=st.pop();
            res.add(remove.val);
            TreeNode right=remove.right;
            while(right!=null){
                st.push(right);
                right=right.left;
            }
        }
       return res; 
    }
}
