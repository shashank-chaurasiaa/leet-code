public class DecimaltoHex {
    public static void main(String[] args) {
      char [] hex = new char[100];
        int num = 78;
        int j = 0;
        int rem;
        int temp = num;
        while(temp!=0){
            rem = temp%16;
            if(rem<10){
                hex [j++] = (char)(48+rem);
            }
            else{
                hex[j++] = (char)(55+rem);
                
            }
            temp = temp/16;

        }
        for(int i =j-1;i>=0;i--){
            System.out.print(hex[i]);
        }
        
    }
    
}
