//This is java solution of inorder traveral of cartesian tree and my first day of uploading my code 
public class Solution {
    public TreeNode buildTree(ArrayList<Integer> A) {
    return newtree(A,0,A.size()-1);
    }
    //we have created newtree method to construct a tree  from arraylist 
    public TreeNode newtree(ArrayList<Integer> A,int s,int e){
    //we are checking the codition at first
        if(s>e){
            return null;
        }
        //its taking max value from a tree
        int m=max(A,s,e);
        //we are add node here of the max index
        TreeNode root= new TreeNode(A.get(m));
        // creating left and right nodes of tree by calling the recursion again till doesn't reach base condition and m-1 is used to get next max from left side
        root.left=newtree(A,s,m-1);
        // m+1 is used to get next max from right side of arraylist and add 
        root.right=newtree(A,m+1,e);
        return root;
    }
    //we have created the max fuction to get the max element from the list
    public int max(ArrayList<Integer> A,int s,int e)
    {
        int m=Integer.MIN_VALUE;
        int index=0;
        for(int i=s;i<=e;i++){
            if(m<A.get(i)){
                m=A.get(i);
                index=i;
            }
        }
        return index;
    }

}
