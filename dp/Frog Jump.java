public class Solution {
    
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int dp[]=new int[n]; 
        for(int i=0;i<n;i++){
            dp[i]=0;
        }
        int f=0;
        int s=0;
        
        for(int i=1;i<n;i++){
            f=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            s=Integer.MAX_VALUE;
            if(i>1){
                s=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(f,s);
        }
      return dp[n-1];
    }
  
}
//coding ninja problem solution in java frog jump 
//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012
