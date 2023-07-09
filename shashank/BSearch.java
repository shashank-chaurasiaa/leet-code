public class BSearch {
    public static void main(String[] args) {

        // Array is sort in ascending order

        // int arr[] = {1,2,3,4,6,8,9,10,11,13};
        // int start = 0;
        // int end = arr.length-1;
        // int mid = (start + end)/2;
        // int ele = 7;

        // while(start<=end){
        //     if(ele == arr[mid]){
        //         System.out.println(mid);
        //         break;
        //     }
        //     else if(ele<arr[mid]){
        //         end = mid-1;
        //     }
        //     else{
        //         start = mid+1;
        //     }
        //     mid = (start + end)/2;
        // }

        // if(start>end){
        //   System.out.println("element not found");

        // }

       // If the Array is sorted in Descending order then

       int arr[] = {13,12,10,9,7,6,5,4,3,2,1,-1};
       int start = 0;
       int end = arr.length-1;
       int mid  = (start + end)/2;
       int ele = 12;
       while(start<=end){
        if(arr[mid] == ele){
            System.out.println(mid);
            break;
        }
        else if(ele < arr[mid]){
            start = mid+1;

        }

        else{
            end = mid-1;
        }

        mid = (start + end)/2;

       }
       if(start > end){
      // /* System.out.println//("element not found")//;*/ 
       }


    }
    
}
