// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       // Solution.mergeSort(arr, 0, n - 1);
        Solution.bubbleSortRecursive(arr, n );
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
class Solution {
        public static void mergeSort(int[] arr, int start, int end){
            if(start >= end) return;
            int mid = (start+end)/2;
            
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        public static void merge(int[] arr, int start, int mid, int end){
            ArrayList<Integer> temp = new ArrayList<>();
            int left = start;
            int right = mid+1;
            
            while(left <= mid && right <= end){
                if(arr[left] <=  arr[right]){
                    temp.add(arr[left]);
                    left++;
                }
                else{
                    temp.add(arr[right]);
                    right++;
                }
            }
            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }
            while(right <= end){
                temp.add(arr[right]);
                right++;
            }
            
            for(int i = start ; i<= end; i++){
                arr[i] = temp.get(i - start);
            }
        }
        public static void bubbleSortRecursive(int[] arr, int n){
            if(n == 1) return;
            boolean didSwap = false;
            for(int i=0 ; i<n-2; i++ ){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    didSwap = true;
                }
            }
            if(!didSwap){
                return;
            }
            bubbleSortRecursive(arr, n-1);
        }
    }
