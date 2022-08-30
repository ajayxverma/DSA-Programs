package Recursion;
public class sumofn {

  /*   public int sumn (int[] arr){
        if(arr.lenght() )

    } */
    public static int prin(int n){
      
        if(n<2){
           return n; 
        }
    System.out.println(n);
      return prin(n-1)+prin(n-2);   
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,3,8,8};
        int s =prin(4);
        System.out.println(" the n is"+s);
    }
    

}
