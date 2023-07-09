public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,1,11,7,12,10};
        int temp = 0,min;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min = j;

                }


            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp; 
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }
}
