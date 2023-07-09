public class StarPatter {

    //star pattern
    
    public static void strpattern(int n){
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    
    //star reverse pattern

    public static void revstrpattern(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
     
    // number pattern 

    public static void numberpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //reverse number pattern


    public static void revstrpatternnum(int n){
        
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    
    }

  //mix pattern 4 for loop using

  public static void mixpattern(int n){   

    for(int i=1;i<=n;i++){     // for row
    
        for(int j=1;j<=i;j++){    // for column
        
            System.out.print("*"+ " ");
        }
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print("*"+" ");
        }
        System.out.println();
    }   

  }
  //space pattern 

  public void spacepattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
  }
// reverse space pattern

  public void revspacepattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=n;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
    }
  }


  // mixed space pattern


   public void mixspacepattern(int n){

    for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=n-1;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
    }


   }

   // Star Triangle pattern

   public void Tripattern(int n){

   /*  for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print( " *");
        }
        System.out.println();
    }*/
    //another way

    for(int i=1;i<=n;i++){
        for(int j=n;j>=1;j--){
            if(j>i){
            System.out.print(" ");
            }
            else{
                System.out.print(" *");
            }
           
        }
        System.out.println();

    }
   }

   public static void linepattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            if(j>i){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
   }

   public void line1pattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        if(i>=2 && j<=i-1){
            System.out.print(" ");
        }
        else{
            System.out.print("*");
        }
        }
        System.out.println();
    }
   }


    public static void main(String[] args) {
        StarPatter sp = new StarPatter();
        // sp.strpattern(5);
        // System.out.println("------------------------------------------------------------------------");
        // sp.numberpattern(7);
        // System.out.println("-------------------------------------------------------------");
        // sp.revstrpattern(6);
        // System.out.println("-----------------------------------------------------------------------");
        // sp.revstrpatternnum(5);
        // System.out.println("---------------------------------------------------------------------------");
         sp.mixpattern(5);
         System.out.println("----------------------------------------------------------------------------");
        // sp.spacepattern(5);
        // System.out.println("-----------------------------------------------------------");
        // sp.revspacepattern(5);
        // System.out.println("--------------------------------------------------------------------------");
        // sp.mixspacepattern(5);
        // System.out.println("-------------------------------------------------------------------------");
        // sp.Tripattern(5);
        // System.out.println("------------------------------------------------------------------------------");
        // sp.linepattern(5);
        // System.out.println("----------------------------------------------------------");
        // sp.line1pattern(5);
    
}
}
