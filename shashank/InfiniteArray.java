public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int key =10;
        int start = 0;
        int end = 1;
        while(key>arr[end]){       // this is for find the key in between the start and end element after this condition we are applying the binary search for given key
            start = end;
            end = end*2;
        } 
        while(start<=key){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(start>end){
            System.out.println("element not found");
        }
    }
    
}
