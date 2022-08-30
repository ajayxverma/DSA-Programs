package Leetcode_java;

import java.util.Scanner;

public class pivotIndex {

    public int findPivot(int[] nums){
        int sum=0;
       for(int i=0; i<nums.length;i++){
        sum+=nums[i];
       }
       int left=0;
       int right=sum;

     for( int i=0; i<nums.length;i++){
            right=right-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];

       }
        return -1;
    }
    public static void main(String[] args) {

        int len;
        int arr[] = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Ente the length of the array");
            len=sc.nextInt();
            
            System.out.println(" enter the elemnt");
            for(int i = 0; i<len; i++){

                arr[i]=sc.nextInt();
               
            }
        }
        pivotIndex ab = new pivotIndex();
        int pi =ab.findPivot(arr);
        System.out.println("The pivot index is "+pi);
    } 
}
