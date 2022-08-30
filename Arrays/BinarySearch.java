/* Binary Search Algorithm  */


package Arrays;

import java.util.Scanner;

public class BinarySearch {

    public int search(int arr[], int find){
        
        int low = 0, high = arr.length-1;

        while(low<=high){
           int mid = (low+high)/2;
           //check if the element is present in the mid
            if(arr[mid] == find){
                return mid;
                //check if the element is greather than mid
            } else if ( find>arr[mid]){
                low = mid +1;

                //else if find is smaller than mid
            } else {
                high = mid-1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the element to be find in {1,2,3,4,5,6,7,8,9} ");
        int find = sc.nextInt();

        
        BinarySearch s = new BinarySearch();
        int key = s.search(arr, find);

       System.out.println("the element is at postion "+ key); 

        
    }
    
}
