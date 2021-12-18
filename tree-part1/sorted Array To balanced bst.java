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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) {
        
       return buildtree(A,0,A.length-1); 
    }
    public TreeNode buildtree(int[] arr,int s,int e){
       if(s>e) {return null;}
       int mid=(s+e)/2;
       TreeNode a = new TreeNode(arr[mid]);
       a.left=buildtree(arr,s,mid-1);
       a.right=buildtree(arr,mid+1,e);
       return a;
       
        

    }
}
