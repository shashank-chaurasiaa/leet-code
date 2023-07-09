public class Searching{
    public static void linear(){
        int[] arr = {1,4,5,6,7,8};
        int s=11;
        int temp=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==s){
                System.out.println("Element present in "+i+" index");
                temp+=1;

            }
        }
        if(temp==0){
            System.out.println("Element doesnt present in given array");
        }
    }

    public  static void stringArr() {
        String[] name = {"ram","sita","laxman","bhole","krishna","radha"};

        String n = "laxman";
        int temp=0;
        for(int i=0;i<name.length;i++){
            if(name[i].equals(n)){
                System.out.println(i);
                temp+=1;
            }
        }
        if(temp==0){
            System.out.println("not found");
        }
    }
    public static void main(String[] ar){
        Searching s1 = new Searching();
        s1.linear();
        s1.stringArr();
    }
}