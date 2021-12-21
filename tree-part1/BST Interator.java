/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    Stack<TreeNode> st=new Stack<>();
    public Solution(TreeNode root) {
        while(root!=null){
        st.push(root);
        root=root.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(st.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp=st.pop();
        int val=temp.val;
        temp=temp.right;
        while(temp!=null){
            st.push(temp);
            temp=temp.left;
        }
        return val;
    }
    
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
