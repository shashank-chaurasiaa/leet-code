import java.util.*;
public class SortArrayRecur {

    public static void bubblesort(int arr[]) {
        sort(arr, arr.length);
        
    }
    public static void sort(int[] arr, int n){
        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
            swap(arr,i,i+1);
          }
        }
        sort(arr,n-1);
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,3};
        bubblesort(arr);
        System.out.println("sorted array is" +Arrays.toString(arr));
    }
    
}
