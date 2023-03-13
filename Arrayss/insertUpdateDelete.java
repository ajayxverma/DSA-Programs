package Arrayss;

import java.util.Scanner;

public class insertUpdateDelete {

    public static int[] insert(int arr[],int x, int pos) {

        int newarr[] = new int[arr.length+1];

        for (int i = 0; i < newarr.length; i++) {
            if( i<pos -1)
                newarr[i] = arr[i];
            else if ( i == pos-1)   
                newarr[i] = x;
            else 
                newarr[i]= arr[i-1];      
        }
        return newarr;       
    }
    public static int[] delete(int arr[], int pos) {

        int newarr[] = new int[arr.length-1];

        for (int i = 0; i < newarr.length; i++) {
            if( i< pos-1)
                newarr[i] = arr[i];
            else 
                newarr[i]= arr[i+1];      
        }
        return newarr;       
    }
    public static int[] update(int arr[],int x, int pos) {

        int newarr[] = new int[arr.length];

        for (int i = 0; i < newarr.length; i++) {
          
            if ( i == pos-1)   
                newarr[i] = x;
            else 
                newarr[i]= arr[i];      
        }
        return newarr;       
    }
  
    
    public static void main(String[] args) {


       
       Scanner sc = new Scanner(System.in);

        System.out.println(" Entert the element to be inserted ");
        int value =sc.nextInt();
        

        System.out.println(" Entert the position of the element ");
        int pos =sc.nextInt();


        int arr1[] = {1,2,3,4,5,6,7,8,9,10};

        

        System.out.println("Arr before insert ");
        for(int i : arr1){
            System.out.print(i +" ");
        }


    //    arr1 = insert(arr1, value, pos);
    arr1 = update(arr1,value,pos);
       System.out.println("Arr After insert ");
        for(int i : arr1){
            System.out.print(i +" ");
        }






    }
}