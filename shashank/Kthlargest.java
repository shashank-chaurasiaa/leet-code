public class Kthlargest {
    public static void main(String[] args) {
        
   
    int [] arr = {8,4,3,7,9,10,11,5,2,1};
    int temp=0;
    int kth = 5;

    for(int i = 0 ; i < arr.length-1;i++){
        for(int j= i+1;j<arr.length;j++){
           // if(arr[i]<arr[j]){             
             if(arr[i]>arr[j]){         //for kth smallest number
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        if(i==kth-1){
            System.out.println(arr[i]);
            break;
        }
    }
}
}
