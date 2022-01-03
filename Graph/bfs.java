import java.util.*;

public class Main
{
    static ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of nodes and edges in the graph :");
		int n=sc.nextInt();
		int e=sc.nextInt();
		for(int i=0;i<=n;i++)
		    adj.add(new ArrayList<Integer>());
		System.out.println("Enter the edges :");
		for(int i=0;i<e;i++){
		    int e1=sc.nextInt();
		    int e2=sc.nextInt();
		    buildGraph(e1,e2);
		}
		System.out.println("Enter the node from which you want to traverse :");
		int target=sc.nextInt();
		System.out.println(bfs(target));
	}
	public static void buildGraph(int e1,int e2){
	    adj.get(e1).add(e2);
	    adj.get(e2).add(e1);
	}
	public static ArrayList<Integer> bfs(int n){
	    ArrayList<Integer> bfs_lst=new ArrayList<Integer>();
	    boolean vis[]=new boolean[adj.size()];
	    Queue<Integer> q=new LinkedList<>();
	    q.add(n);
	    vis[n]=true;
	    
	    while(!q.isEmpty()){
	        int temp=q.poll();
	        bfs_lst.add(temp);
	        for(Integer e:adj.get(temp)){
	            if(!vis[e]){
	                vis[e]=true;
	                q.add(e);
	            }
	        }
	    }
	    return bfs_lst;
	}
}
