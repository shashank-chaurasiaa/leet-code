// Print 1 to N using recursion

public class Print_num_recur {

  static  void print(int N){
        if(N==1){
            System.out.println(N);
        }
        else{
    print(N-1);
    System.out.println(N);
    }

    }

    public static void main(String[] args) {
        print(10);
    }
    
}
