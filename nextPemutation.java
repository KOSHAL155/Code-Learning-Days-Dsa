/* Online Java Compiler and Editor */
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        //int [] arr = new int[]{2,1,5,4,3,0,0};
        int [] arr = new int[]{3,2,1};

        nextPermutation(arr);

     }
     public static void nextPermutation(int []arr){
        int breakPoint = 0;
        int greaterThenBreakPoint = 0;
        ArrayList<Integer> sorted = new ArrayList<>();
        int cnt = 0;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i] > arr[i-1]){
                breakPoint = i-1;
                cnt++;
                break;
            }
            
        }
        for(int i=arr.length-1;i>0;i--){
           if(arr[breakPoint] < arr[i]){
               greaterThenBreakPoint = i;
               break;
           }
            
        }
        int temp = arr[breakPoint];
        arr[breakPoint] = arr[greaterThenBreakPoint];
        arr[greaterThenBreakPoint] = temp;
        if(breakPoint > 0) breakPoint += 1; 
        for(int i=breakPoint;i<arr.length;i++){
            sorted.add(arr[i]);
        }
        int n = sorted.size()-1;
        for(int i = breakPoint;i<arr.length;i++){
            arr[i] = sorted.get(n--);

        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     }
}
