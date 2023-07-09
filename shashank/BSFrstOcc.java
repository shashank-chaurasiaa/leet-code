// FIND FIRST OCCURANCE ELEMENTS THROUGH BINARY SEARCH

public class BSFrstOcc {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,5,6,10,10,11};
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        int mid = (start + end)/2;
        int ele = 10;

        while(start<=end){
            if(arr[mid] == ele){
                result = mid;
                end = mid-1;
                

            }
            else if(ele<arr[mid]){
                end = mid-1;

            }
            else{
                start = mid+1;
            }
            mid = (start+end)/2;
        }
        System.out.println(result);

        // FIND LAST OCCURANCE ELEMENTS

        // int arr[] = {1,2,3,4,5,6,6,6};
        // int start = 0;
        // int end = arr.length-1;
        // int mid = (start + end)/2;
        // int ele = 6;
        // int result = -1;

        // while(start<=end){
            
        //     if(arr[mid]==ele){
        //         result = mid;
        //         start = mid + 1;
                
        //     }
        //     else if(ele<arr[mid]){
        //         end = mid-1;

        //     }
        //     else{
        //         start = mid+1;
        //     }
        //     mid = (start+end)/2;
          

        // }
        // System.out.println(result);

    }
    
}
