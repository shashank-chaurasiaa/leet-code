public class PeakEle {
    public static void main(String[] args) {
        int[] arr = {5,10,20,15};
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(mid>0 && mid<end-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    System.out.println(mid);
                    break;
                }
                else if(arr[mid]<arr[mid-1]){
                    end = mid-1;


                }
                else{
                    start = mid+1;
                }
            }
            else if(mid==0){
                if(arr[0]>arr[1]){
                    System.out.println(arr[0]);
                }
                else{
                    System.out.println(arr[1]);
                }
                break;
            }
            else if(mid == end){
                if(arr[end]>arr[end-1]){
                    System.out.println(arr[end]);
                }
                else{
                    System.out.println(arr[end-2]);
                }
                break;
            }

        }
    }
    
}
