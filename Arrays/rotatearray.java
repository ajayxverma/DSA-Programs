package Arrays;

public class rotatearray {


    public static int[] rotate(int arr[], int pos){



        int newarr[] = new int[arr.length];
        int temp[] = new int[pos];
        int count=0;

        for (int i = 0; i < newarr.length; i++) {
            if( i< pos ){
            temp[i]=arr[i];
        }else{
            newarr[i-pos] = arr[i];
            count++;
            }
   
        }

        int i=0;
        while(count<newarr.length){
            newarr[count++] = temp[i];
            i++;

        }
        return newarr;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int pos = 2;

        System.out.println("Element before concating");

    for(int j : arr){
        System.out.print(j+" ");
    }
       arr = rotate(arr, pos);
    System.out.println("Element after concating");

    for(int j : arr){
        System.out.print(j+" ");
    }
} 
    
}
