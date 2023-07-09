public class PositionFirst1InfiniteArr {
    public static void main(String[] args) {
        int binary_Arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,00,1,1,1,1,1,1,1,1,1,1}; //{0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1...........infinite}

        int start = 0;
        int end = 1;
        int key = 1;
        int res=0;
        while(key>binary_Arr[end]){
            start = end;
            end = end*2;
        }
        while(start<=end){                     //this question is combination of firstoccurance and search element of sorted infinite element
            int mid = (start+end)/2;
            if(binary_Arr[mid]==key){
              res = mid;
              end = mid-1;
            }
            else if(binary_Arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        System.out.println(res);
    }
}
