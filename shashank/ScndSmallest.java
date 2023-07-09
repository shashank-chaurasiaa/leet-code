// Second Smallest Element of Array

public class ScndSmallest {
    public static void main(String[] args) {
        int [] arr = {1,4,6,7,9,10,3,2,5};
        
        int max = Integer.MAX_VALUE;          // Default maximum values of integer is 2147483648
        int second_max = Integer.MAX_VALUE;

        for(int i= 0;i<arr.length;i++){
            if(arr[i] < max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i]<second_max && arr[i] !=max){
                second_max = arr[i];
            } 
        }
        if(second_max == Integer.MAX_VALUE){
            System.out.println("Second Max element is not present");
        }
        else{
            System.out.println("Second Max element is "+ second_max);
        }
        
    }
    
}
