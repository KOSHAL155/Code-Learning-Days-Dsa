public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int res=0,n=A.size();
        int start[]=new int[n];
        int end[]=new int[n];

        for(int i=0;i<n;i++){
            start[i]=A.get(i).get(0);
            end[i]=A.get(i).get(1);
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i=0,j=0;
        while(i<n){
              if (start[i]<end[j])
        i++;
       else if (start[i]>end[j])
        j++;
       else {
         i++;
         j++;
       }
       res=Math.max(res,i-j);}
    return res;
    }
}
//interview bit solution meeting rooms 
