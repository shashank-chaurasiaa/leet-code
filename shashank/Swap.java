public class Swap {
    // public static void main(String[] args) {
    //     int c=10;
    //     int b=20;
    //     c=c+b;
    //     b=c-b;
    //     c=c-b;

    //     System.out.println("a="+c+ " b=" +b);
    // }
    // Binary search

        public static void main(String[] args) {
            int[] num = {1,5,6,7,8,9,11,14,17};
    
            int left = 0;
            int right = num.length-1;
            int mid = (left+right)/2;
            int item = 5;
            
            while(left<=right){
                if(num[mid]==item){
                    System.out.println("Item found in "+mid+ " index");
                    break;
                }
    
                else if(num[mid]<item){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
                mid = (left+right)/2;
            }
    
            if(left>right){
                System.out.println("element does not found");
            }
        }
     
        
    
    }
    

