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
    HashMap<Integer,ArrayList<Integer>>mp;
    public int[] solve(TreeNode A) {
        ArrayList<Integer> ans=new ArrayList<>();
         mp = new HashMap<>();
        diagonallysolve(A,0);

        for(Map.Entry<Integer, ArrayList<Integer>> me: mp.entrySet()){
            ans.addAll(me.getValue());}
        int [] res= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    public void diagonallysolve(TreeNode a,int d){
        if(a==null){
            return ;
        }
    mp.putIfAbsent(d,new ArrayList<>());
    mp.get(d).add(a.val);
    diagonallysolve(a.left,d+1);
    diagonallysolve(a.right,d);
    }
}
