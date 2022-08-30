package Recursion;

public class nfactorial {


    public static int fact1(int n){

        if(n==1 || n ==0){
            return 1;
        }
        
        return n*fact1(n-1);

  
    }
   /*  public static int fact(int n){
        if(n==1 || n ==0){
            return 1;
        }

        int fa = fact(n-1);
        int sol = n*fa;
        System.out.print("the value of n is"+n);
        System.out.print("************** ");
        System.out.print(" fa value"+ fa);
        System.out.println(" ");
        
        return sol;
        

    } */
    public static void main(String[] args) {
      
      System.out.println("the factorina of "+fact1(5));
    }
}
