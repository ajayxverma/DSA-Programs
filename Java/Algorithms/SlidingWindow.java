/* Sliding window using MAXMIN */

// package Algorithms;

public class SlidingWindow {
    public static int maxsum(int[] arr, int a){
        int s=0, e=a;
        int sum=0;
        for (int i = 0; i < a; i++) {
            sum+=arr[i];  
        }
        int temp = sum;
        for (int i = 0; a < arr.length; i++) {
            temp+=arr[a++]-arr[i];
            if(temp>sum) sum=temp;
        }
        return sum;
    }
    public static void main(String[] args) {
      int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
      System.out.println(maxsum(arr, 2));   
    }
    
}
