import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] num1 ={1,1,1,2,2,4,5,6,7};
        int[] num2 ={1,3,3,3,4,5,7};
        
        int left=0;
        int right=0;
        List<Integer> res = new ArrayList<>();

        while(left<num1.length && right<num2.length){

            while(left>0 && left<num1.length && num1[left]==num1[left-1]){
                left++;
            }

            while(right>0 && left<num2.length && num2[right]==num2[right-1]){
                right++;
            }

            if(left>=num1.length || right>=num2.length){
                break;
            }

            if(num1[left]<num2[right]){
               
                left++;
            }
            else if(num1[left]>num2[right]){
                
                right++;
            }
            else{
                res.add(num1[left]);
               
                left++;
                right++;
            }
            

        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);;
        }
        for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]+" ");}




    }
    
}
