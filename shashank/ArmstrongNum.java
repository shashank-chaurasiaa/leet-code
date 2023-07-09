import java.util.Scanner;
public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
       int num = sc.nextInt();;
       int length=0;
       int temp = num;
       int arm=0;
       int rem;
      

       // finding length of number.
        while(temp!=0){
            temp=temp/10;
            length = length+1;
        }

        //for armstrong logic similar to pallindrome/reverse
        int temp2=num;
       
        while(temp2!= 0){
            int mul=1;
            rem=temp2%10;
            for(int i=1;i<=length;i++){
                mul=mul*rem;
            }
           
            arm = arm + mul;
            temp2 = temp2/10;

        }

        if(arm == num){
            System.out.println("Armstrong number");
        } 
        else{
            System.out.println("Not armstrong number");
        }


    }
}