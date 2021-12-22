/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }
        Queue<TreeLinkNode> res= new LinkedList<>();
        res.add(root);
        res.add(null);
        while(res.peek()!=null){
            int s=res.size()-1;
            while(s-->0){
                TreeLinkNode n= res.remove();
                n.next=res.peek();
                if(n.left!=null){
                    res.add(n.left);
                }
                if(n.right!=null){
                    res.add(n.right);
                }
            }
            res.remove();
            res.add(null);
        }
        
    }
}
