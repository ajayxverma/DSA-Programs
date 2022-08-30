package Arrays;

import java.util.Scanner;

public class test {

    public static int search(int arr[], int find){

        int high = arr.length;
        int low = 0;

        int mid = (high+low)/2;

        while(low<=high){

            mid = (high+low)/2;
            if(find==arr[mid]){
                return mid; 
            } else if(find<arr[mid]){
                high=mid-1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the element to be find in {1,2,3,4,5,6,7,8,9} ");
        int find = sc.nextInt();
        test s = new test();
        int key = s.search(arr, find);
       System.out.println("the element is at postion "+ key); 

    }
    
    
}
