/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
       
    HashMap<UndirectedGraphNode,UndirectedGraphNode> mp=new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
      return clone(node);
    }
    public UndirectedGraphNode clone(UndirectedGraphNode node){
        if(node==null){
            return node;
        }
        if(mp.containsKey(node)){
            return mp.get(node);
        }
        UndirectedGraphNode c=new UndirectedGraphNode(node.label);
        mp.put(node,c);
        for(UndirectedGraphNode n:node.neighbors){
            c.neighbors.add(clone(n));
        }
        return  c;
    }
}
