//Progeam Name in leetcode: Running Sum of 1D Array
package Leetcode_java;

import java.util.Scanner;
class SumOfArray {
    public static void main(String[] args) {
        int n,sum=0;
       Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no of element to store");
            n=sc.nextInt();
            int arr[] = new int[10];
            System.out.println(" Enter the Element");

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                sum+=arr[i];
                arr[i]=sum;
            }
            System.out.println("The Running sum of the Array is ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        
    
    }
}