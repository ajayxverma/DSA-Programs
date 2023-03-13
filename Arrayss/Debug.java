package Arrayss;

public class Debug{

    public static int minOperations(int n) {
        int[] arr= new int[n];
        int c=0,mid=(n-1)/2;
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
            if(arr[i]!=n && i<=mid){
                c=c+(n-arr[i]);
            }
        }
        return c;
    }
    public static void main(String[] args) {
           System.out.println( minOperations(5));

        
    }
}