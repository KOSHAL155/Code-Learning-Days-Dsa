public class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList <ArrayList<Integer>> res=  new ArrayList<>();
        if(A==null){ return res;}
        Queue<TreeNode> q= new LinkedList<>();
        Queue<Integer> level=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> mp= new HashMap<>();
        q.offer(A);
        level.offer(0);
        int minL=0;
        int maxL=0;
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            int l=level.poll();
            minL=Math.min(minL,l);
            maxL=Math.max(maxL,l);
            if(!mp.containsKey(l)){
                mp.put(l,new ArrayList<Integer>());
            }
            mp.get(l).add(n.val);
            if(n.left!=null){
                q.offer(n.left);
                level.offer(l-1);
            }
            if(n.right!=null){
                q.offer(n.right);
                level.offer(l+1);
            }
        }
        for(int l=minL;l<=maxL;++l){
            if(mp.containsKey(l)){
                res.add(mp.get(l));
            }
        }
        return res;
    }
}
