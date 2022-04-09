import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        getSum(0,candidates,target,res,new ArrayList<>());
        return res;
        
    }
    public static void getSum(int i,int[] a, int b,List<List<Integer>> res,ArrayList<Integer> ds){
       
            if(b==0){
                res.add(new ArrayList<>(ds));
            return ;     
            }
           
        for(int j=i;j<a.length;j++){
            if(j>i && a[j]== a[j-1]){
                continue;
            }
            if(a[j]>b){break;}
            
             ds.add(a[j]);
            getSum(j+1,a,b-a[j],res,ds);
            ds.remove(ds.size()-1);
            
            
        }
        
       
        
    }
}

//leetcode solution
