package Sorting;


//count Srot Algo
public class CountSort {

    public static int[] sort(int[] nums){
        // '3' is no of unique element
        //counting for loop to count the no of unique element in the array
        int[] count = new int[3];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;  
        }
        //acumilating the count array for the exact match of the index : 
        //adding the count of the previous element to the current element
        for(int i = 1; i < count.length; i++){
            count[i]+=count[i-1];
        }
        //sorting the element at the given 
        //note: decerease the element and then add the element 
        int[] sorted = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--){
 
           sorted[--count[nums[i]]] = nums[i]; 
        }

        return sorted;
        
    }
    
    public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        int[] sorted = new int[nums.length];
        sorted = sort(nums);

        for (int i : sorted) {

            System.out.print(i+",");
            
        }
        
    }
    
}
