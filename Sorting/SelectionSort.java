package Sorting;
public class SelectionSort {

    public static int[] sort(int arr[]){
        for( int i = 0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length-1; j++){

                
                if( arr[small]>arr[j]){
                    small=j;
                }

            }
          int temp=arr[small];
          arr[small]= arr[i];
          arr[i]=temp;

        }
        return arr;
    }
    public static void printarray( int arrr[]){
        for (int i =0; i<arrr.length-1; i++){
            System.out.print(arrr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = { 3, 4, 2, 7, 2, 5, 6, 3, 7, 3, 2,};


        
        sort(arr);
        printarray(arr);
        }
    
}
