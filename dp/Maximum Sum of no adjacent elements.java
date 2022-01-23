//Recursion Method
//Maximum Sum of no adjacent elements.java
//coding ninja problem
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
        int notPick=sum(n-1,a,dp);
        return dp[n]=Math.max(pick,notPick);
    }
}

// tabulation method
import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        //tabulation method
           int n=nums.size();
        int dp[]=new int[n];
        dp[0]=nums.get(0);
        for(int i=1;i<n;i++){
            dp[i]=-1;
        }
        for(int i=1;i<n;i++){
            int pick=nums.get(i);
                if(i>1){
                    pick+=dp[i-2];
                }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        
        return dp[n-1];}}

//Space Optimized

import java.util.*;
public class Solution {
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
        int n=nums.size();
        int prev=0;
        int prev1=0;
        prev=nums.get(0);
      int max=0;
        for(int i=1;i<n;i++){
            int pick=nums.get(i)+prev1;
                
            int notPick=prev;
            
           int cur=Math.max(pick,notPick);
            prev1=prev;
            prev=cur;
        }
        return prev;
    }}
