public class Arraymin {
    public static void main(String[] args) {
        int arr[] = {2,4,6,1,8,10,-1,-2};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
            min = arr[i];
            }
        }
        System.out.println(min);
    }

}
