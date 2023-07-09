import java.util.*;
public  class Union
{
    public static void main(String[] args) 
    {
        int  num1[]={1,1,1,2,2,3,3,3,5,1,16,11};
        int  num2[]={3,3,3,4};

        int left=0;
        int right=0;
        List<Integer> res = new ArrayList<>();

         while(left<num1.length || right<num2.length)
         {

            //for removing duplicate elements
            while(left>0 && left<num1.length && num1[left]==num1[left-1])
            {
                left++;
            }
            while(right>0 && right<num2.length && num2[right]==num2[right-1])
            {
                right++;
            }
            if(left>=num1.length)
            {
                res.add(num2[right]);
                    right++;
                    continue;
            }
            if(right>=num2.length)
            {
                    res.add(num1[left]);
                        left++;
                        continue;
            }
            if(num1[left]<num2[right]){
                        res.add(num1[left]);
                        left++;
                       
                    }
            else if(num1[left]>num2[right]){
                        res.add(num2[right]);
                        right++;
                        
                    }
            else{
                    res.add(num1[left]);
                       
                        right++;
                        left++;
                    }
                
            }
            System.out.println(res);
            

        }   

}  
 

