public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {19,18,6,5,8,11,12,15};
        int start = 0;
        int end = arr.length-1;
        int mid;
        int pre;
        int next;
        int N = arr.length-1;
        int res =0;
        while(start<=end){
            mid = (start+end)/2;
            pre = (mid+N-1)%N;
            next = (mid+1)%N;
            if(arr[mid]<=arr[pre] && arr[mid]<=arr[next])
            {
               res =mid;
               break;
            }

            else if(arr[start]<=arr[mid]){
                start = mid+1;

            }
            else if(arr[mid]<=arr[end]){
                end = mid-1;

            }
             
       

    }
    System.out.println(res);
        }
}
    

