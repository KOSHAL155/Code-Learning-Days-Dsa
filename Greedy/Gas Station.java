public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int canCompleteCircuit(final List<Integer> A, final List<Integer> B) {
     
        int fuel=0;int start=0;int sum=0;
        for(int i=0;i<A.size();i++){
            sum+=(A.get(i)-B.get(i));
            fuel+=(A.get(i)-B.get(i));
            if(fuel<0){     
                fuel=0;
                start=i+1;
            }
        }
        if(sum>=0){
            return start;
        }
        return -1;
    }
}
