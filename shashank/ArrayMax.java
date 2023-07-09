import java.util.*;
public class ArrayMax {
    public static void main(String[] args) {
        
   
    int arr[] = {5,9,8,7,3,2,1,10};
    int max = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    System.out.println(max);




//     sort(arr);
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//     }
//     System.out.println(arr[arr.length-1]);
// }
//  public static void sort(int[] arr){
//     Arrays.sort(arr);
}
 }
