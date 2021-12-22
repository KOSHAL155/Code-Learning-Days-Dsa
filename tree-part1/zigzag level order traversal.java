//interview bit solution zigzag level order traveresal using stack in java or spiral order traversal

public class Solution {
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    
	    if(a==null)
	       return null; 
	       
	    Stack<TreeNode> evenStack = new Stack<TreeNode>();
	    Stack<TreeNode> oddStack = new Stack<TreeNode>();
	    evenStack.push(a);
	    
	    ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>(); 
	    
	    while(!evenStack.isEmpty() || !oddStack.isEmpty())
	    {
	        
	        ArrayList<Integer> evenLevel = new ArrayList<Integer>(); 
	        while(!evenStack.isEmpty())
	        {
	            TreeNode node = evenStack.pop();
	            evenLevel.add(node.val);
	            
	            if(node.left !=null)
	               oddStack.push(node.left);
	            
	            if(node.right !=null)
	               oddStack.push(node.right);
	        }
	        if(evenLevel.size()>0)
	             main.add(evenLevel);
	        
	        ArrayList<Integer> oddLevel = new ArrayList<Integer>(); 
	        
	        while(!oddStack.isEmpty())
	        {
	            TreeNode node = oddStack.pop();
	            oddLevel.add(node.val);
	            
	            if(node.right !=null)
	               evenStack.push(node.right);
	            
	            if(node.left !=null)
	               evenStack.push(node.left);
	        }
	        if(oddLevel.size()>0)
	            main.add(oddLevel);
	    }
	    return main; 
	}
}
