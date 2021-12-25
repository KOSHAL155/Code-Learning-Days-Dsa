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
           public  void printVerticalSum(TreeNode root, int dist, Map<Integer, Integer> map)
    {
        if (root == null) {
            return;
        }
        map.put(dist, map.getOrDefault(dist, 0) + root.val);
        printVerticalSum(root.left, dist - 1, map);
        printVerticalSum(root.right, dist + 1, map);
    }
    public int[] verticalSum(TreeNode A) {
        Map<Integer, Integer> map = new TreeMap<>();
        printVerticalSum(A, 0, map);
        int i=0;
        ArrayList<Integer> ans=new ArrayList<Integer>(map.values());
       int res[] =new int[ans.size()];
       for(i=0;i<ans.size();i++){
           res[i]=ans.get(i);
       }
return res;
    }
}
