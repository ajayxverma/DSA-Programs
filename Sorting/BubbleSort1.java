package Sorting;
public class BubbleSort1 {


    public static int[] sort(int ary[]){

        for(int i=0; i<ary.length; i++){
            for(int j=0; j<ary.length-i-1; j++){
                if(ary[j]>ary[j+1]){
                    int temp = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = temp;
    
                }
    
            }
        }
        return ary;
    }


    public static void printarray( int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

   public static void main(String[] args) {
    
    int ary[] = { 1,7,3,6,3,8,4,9,2};

   
    System.out.println();
    sort(ary);
    printarray(ary);

   }
}
