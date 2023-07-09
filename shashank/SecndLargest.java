//Second Largest Element of Array

import java.util.*;
public class SecndLargest {
    public static void main(String[] args) {
        int [] arr = {5,6,3,10,8,11,2,1};

        int largest = Integer.MIN_VALUE;   
                                                      // Largest = -2147483648  this is the minimum value of integer
        int second_largest  = Integer.MIN_VALUE;     // second_largest = -2147483648

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                second_largest  = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest && arr[i] !=largest){

                second_largest = arr[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE){

            System.out.println("second largest element is not present");

        }
        else{
            System.out.println("second largest element is "+ second_largest);
        }
    }

    
}
