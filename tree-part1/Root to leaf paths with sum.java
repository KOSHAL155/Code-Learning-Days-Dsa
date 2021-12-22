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
      ArrayList<ArrayList<Integer>> res= new ArrayList<>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        if(A==null){
            return res;
        }
       Stack<Integer> p= new Stack<Integer>();        
        pathSumlist(A,B,p);
        return res;

    }
    public void pathSumlist(TreeNode a,int b,Stack<Integer>c){
        c.push(a.val);
        if(a.left==null && a.right==null){
            if(b==a.val) {res.add(new ArrayList<Integer>(c));}
            }
            if(a.left!=null){
                pathSumlist(a.left,(b-a.val),c);
            }
            if(a.right!=null){
                pathSumlist(a.right,(b-a.val),c);
            }
            c.pop();
        }
    }

