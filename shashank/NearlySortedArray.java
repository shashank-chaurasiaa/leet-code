public class NearlySortedArray {
    public static void main(String[] args) {
        int arr[] = {5,10,30,20,40};
        int start = 0;
        int end =arr.length-1;
        int ele = 10;
        int mid;

        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid]==ele){
                System.out.println(mid);
                break;
            }
            else if(mid-1>=start && arr[mid-1] == ele){ // array does not out of bound
                System.out.println(mid-1);
                break;
            }
            else if(mid+1<= end && arr[mid+1] == ele){
                System.out.println(mid+1);
                break;
            }
            else if(arr[mid]<ele){
                start = mid+2;
            }
            else{
                end = mid-2;
            }


        }
        if(start>end){
            System.out.println("element not found");
        }
    }
    
}
