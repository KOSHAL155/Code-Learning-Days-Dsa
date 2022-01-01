import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertex and edges :");
		int m=5;
		int n=8;
		int arr[][]=new int[m+1][n+1];
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
	public static void addGraph(int a,int b,int arr[][]){
	    arr[a][b]=1;
	    arr[b][a]=1;
	}
	public static void display(int arr[][]){
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr[0].length;j++){
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
