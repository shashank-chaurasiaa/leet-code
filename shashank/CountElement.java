import javax.sound.sampled.SourceDataLine;

public class CountElement {
    public static int firstcount(int arr[] , int ele , int start , int end){
int result1 = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==ele){
                result1 = mid;
                end = mid -1;
            }
            else if(arr[mid]>ele){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            mid = start +(end-start)/2;
        }

      
       return result1;
        
    }
    public static int lastcount(int arr[],int ele,int start, int end){
        int result2 = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==ele){
                result2=mid;
                start=mid+1;
            }
            else if(arr[mid]>ele){
                end =mid-1;
            }
            else{
                start =mid+1;
            }
            mid = start+(end-start)/2;

        }
       return result2;
    }

    public static int countoccurances(int arr[],int ele){
         int start = 0;
         int end = arr.length-1;
         int firstindex = firstcount(arr,ele,start,end);

         if(firstindex ==-1){
            return 0;
         }
         int lastindex = lastcount(arr,ele,start,end);
         int count = lastindex-firstindex+1;
         return count;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,6};
        int ele = 6;
        int start=0;
        int end=arr.length-1;

        System.out.println("first occurance element in  index "+ firstcount(arr,ele,start,end));
        System.out.println("last occurances element in index "+ lastcount(arr,ele,start,end));
        System.out.println("counting elements are "+countoccurances(arr,ele));
       
      
    }
        
     

        

}

