//Path to given Node interviewbit solution java
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
    ArrayList<Integer> ans= new ArrayList<>();
    public int[] solve(TreeNode A, int B) {
        
        find(A,B);

        int []res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    public boolean find(TreeNode a,int b){
         if(a==null){
             return false;
           
        } ans.add(a.val);
         if(a.val==b){
            return true;
        }
       
       
       
       if (find(a.left,b)|| find(a.right,b)){
           return true;
       }
         ans.remove(ans.size()-1);
       return false;
    }
}
