class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        getSum(0,candidates,target,res,new ArrayList<>());
        return res;
        
    }
    public static void getSum(int i,int[] a, int b,List<List<Integer>> res,ArrayList<Integer> ds){
    if(i==a.length){
        if(b==0){
            res.add(new ArrayList<>(ds));
        }
        return;
    }
        if(a[i]<=b){
            ds.add(a[i]);
            getSum(i,a,b-a[i],res,ds);
            ds.remove(ds.size()-1);
        }
        getSum(i+1,a,b,res,ds);
    }
}

//this is the leetcode solution for combinational sum
