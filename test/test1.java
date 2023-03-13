package test;

import java.util.List;

public class test1 {

    public static void main(String[] args) {
        int[] arr = {2, -3, -4, 1,4,5,-1,-2,0,6,8,11};

        
        
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( max < arr[i]) max = arr[i];
            if( min > arr[i]) min = arr[i];   
        }


        for(int j = min; j < max; j++) {
            boolean flag = false;
           for (int i = 0; i < arr.length; i++) {
            if(arr[i] == j) {
                flag = true;
            }  
               
           }

           if(!flag) {
            System.out.println(j);;
           }

        }

        
    }
    
}
