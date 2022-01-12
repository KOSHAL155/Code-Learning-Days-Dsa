public class Solution {
    public static int maxp3(ArrayList<Integer> a) {
        Collections.sort(a);
        int n = a.size();
     
        return Math.max((a.get(n-1) * a.get(n-2) * a.get(n-3)),
                        (a.get(n-1) * a.get(0) * a.get(1)));
    }
}
