public class Solution {
    public int mice(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.sort(A);
        Collections.sort(B);
        int diff=0;
        int res=0;
        for(int i=0;i<A.size();i++){
            diff=Math.abs(A.get(i)-B.get(i));
            res=Math.max(res,diff);
        }
    return res;
    }
}
