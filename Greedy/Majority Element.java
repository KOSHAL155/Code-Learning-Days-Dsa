public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> a) {
   if(a == null)
            return -1;
        
        int maj = a.get(0);
        int count = 1;
        int n = a.size();
        
        for(int i = 1; i < n; i++){
            if(a.get(i) == maj)
                count++;
            else if(count == 1)
                maj = a.get(i);
            else 
                count--;
        }

        count = 0;
        for(int i = 0; i < n; i++){
            if(a.get(i) == maj)
                count++;
        }

        if(count >= a.size()/2)
            return maj;
        return -1;
    }
    
}
