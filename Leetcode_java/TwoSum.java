

import java.util.Arrays;
import java.util.Scanner;

class TwoSum {
    public int[] Sums(int[] nums, int target) {
        int got[]= new int[2];
      for(int i=0; i<nums.length-1; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]+nums[j]==target){
                got[0]=i;
                got[1]=j;
                
            }
          

        }
      }
      return got;
      
    }
    
    public static void main(String[] args){
        
    int len,tar;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of element in the array");
    len= sc.nextInt();
    int arr[] = new int[len];
    for(int i =0; i<arr.length;i++){
        arr[i]=sc.nextInt();

    }

    System.out.println("*******************");
    for(int i =0; i<arr.length;i++){
        System.out.println(arr[i]);
        
    }

    
    System.out.println(" Enter the target value");
    tar=sc.nextInt();

    TwoSum sm = new TwoSum();  
    String solution= Arrays.toString(sm.Sums(arr, tar));
    System.out.println(solution);
     

    }
}