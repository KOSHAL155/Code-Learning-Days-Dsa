import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int n=nums.size();
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return sum(n-1,nums,dp);
	}
    public static int sum(int n,ArrayList<Integer> a,int []dp){
        if(n==0){
            return a.get(n); 
        }if(n<0){
            return 0;
        }if(dp[n]!=-1){
            return dp[n];
        }
        int pick = a.get(n)+sum(n-2,a,dp);
        int notPick=0+sum(n-1,a,dp);
        return dp[n]=Math.max(pick,notPick);
    }
}
//Maximum Sum of no adjacent elements.java
//coding ninja problem
