public class FactRecur {
    int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);

        }
        }    


public static void main(String[] args) {
    
    FactRecur fct = new FactRecur();
    int ans = fct.fact(0);
    System.out.println(ans);

}
}
