import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        //int [] arr = {12,11,25,32,15,10,33};
        String[] arr = {"ram" ,"shayam","krishna","laxman","balram"};
         // int temp;
        String temp;
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){  // 1st character of string is equal to second string character so its give 0 
                    temp = arr[j];                // 1st character of string is less tahn to second string character so its -1
                                                 //1st  character of string is greater than to second string character so its 1.
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    flag = 1;
                    
                }

            }
            if(flag==0){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}
