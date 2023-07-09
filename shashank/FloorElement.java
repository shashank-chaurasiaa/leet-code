import java.util.Scanner;
public class FloorElement {
    public static void main(String[] args) {

       // int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
       Scanner s = new Scanner(System.in);
       System.out.println("size of elements");
       int n = s.nextInt();
       System.out.println("array elements are");
       int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = s.nextInt();
      }
      System.out.println("item");

       int ele = s.nextInt();
        int start = 0;
        int end = arr.length - 1;

        
        int floor = 0;
       int ceil =0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
           if(arr[mid]<ele){
            floor = arr[mid];  //for floor value
            start = mid+1;
           }
           else if(arr[mid]>ele){
            ceil = arr[mid];  // for ceiling value
            end = mid-1;

           }
           else{
            floor = arr[mid];
            ceil = arr[mid];
            break;
           }
        }
        System.out.println("floor elements "+floor);
        System.out.println("ceiling elements "+ceil);
    }

}
