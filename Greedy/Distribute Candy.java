public class Solution {
    public int candy(ArrayList<Integer> A) {
        int [] candies=new int [A.size()];
        candies[0]=1;
        for(int i=1;i<A.size();i++){
            if(A.get(i)>A.get(i-1)){
                candies[i]=candies[i-1]+1;
            }
            else{
                candies[i]=1;
            }
        }
        int res=candies[A.size()-1];
        for(int i=A.size()-2;i>=0;i--){
            int cur=1;
            if(A.get(i)>A.get(i+1)){
                cur=candies[i+1]+1;
            }
            res=res+Math.max(cur,candies[i]);
            candies[i]=cur;
        }
        return res;
    }
}
