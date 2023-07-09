/*in this question we are finding the minimum difference between the given key or the elemnts of array if minimum number find
 we return the correspondance element of array ex- arr[] = {2,5,8,10}, key=4, 
                                                            4,4,4,4={-2,-1,4,6} absolute value we take means negative value always positive in the absolute
    so minimum difference 1 so the final will be 5 thats it                                                         
 */

import javax.sound.sampled.SourceDataLine;

public class MinDiffEle {
    public static void main(String[] args) {

        //binary search
        int[] arr = {1,3,8,10,14};
        int start = 0;
        int end = arr.length-1;
        int key = 12;
        int mid = -1;

        while(start<=end){
            mid = start+(end-start)/2;
            if(arr[mid]==key){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
       
        int a = arr[start]-key;
        int b = arr[end]-key;
       
       if(Math.abs(a)<Math.abs(b)){
        System.out.println(arr[start]);
       }
       else{
        System.out.println(arr[end]);
       }
    
        
    }
}
