import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=5;
		int n=8;
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<m+1;i++)
		    arr.add(new ArrayList<Integer>());
		System.out.println("Number of vertex and edges are :"+m+" "+n);
		addGraph(1,2,arr);
		addGraph(2,3,arr);
		addGraph(3,4,arr);
		addGraph(1,4,arr);
		addGraph(1,5,arr);
		addGraph(2,5,arr);
		addGraph(4,5,arr);
		addGraph(3,5,arr);
		display(arr);
		
	}
	public static void addGraph(int a,int b,ArrayList<ArrayList<Integer>> arr){
	    arr.get(a).add(b);
	    arr.get(b).add(a);
	}
	public static void display(ArrayList<ArrayList<Integer>> arr){
	    System.out.println("Adjacency List of graph : ");
	    for(int i=0;i<arr.size();i++){
	        for(int j=0;j<arr.get(i).size();j++){
	            System.out.print(arr.get(i).get(j)+" ");
	        }
	        System.out.println();
	    }
	}
}
