package DSA;

import java.util.Scanner;

public class maxminarr {

    public int findmax(int arr[]){

        int max=0;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];

            }
        }
        return max;
    }

    public int findmin(int arr[]){

        int min=arr[0];

        for(int i=0; i<arr.length-1; i++){

            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public void print(int data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ->");
        }
    }


    public static void main(String[] args) {
        int len;
        System.out.println("Enter the array length");
        Scanner sc = new Scanner(System.in);
        len=sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter the array ");
        for(int i=0; i<len; i++){
            arr[i]= sc.nextInt();
        }
        maxminarr fin = new maxminarr();
        fin.print(arr);
        System.out.println("The max of the array is"+fin.findmax(arr));
        System.out.println("The min of the array is"+fin.findmin(arr));
  
    }
    
}
