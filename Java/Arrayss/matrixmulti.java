package Arrayss;

import java.util.Scanner;

public class matrixmulti {

    public static int[][] mulit(int arr1[][],int arr2[][]){


       
        if(arr1.length != arr2[0].length ){
            return null;
        }
        int row =arr1.length;
        int col = arr2[0].length;
        int prod[][] = new  int[row][col];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for(int k=0; k<arr2.length; k++){
                    prod[i][j]+= arr1[i][k]*arr2[k][j];
                    
                }
                
            }
        }
        return prod;


    }



    public static void print(int arr1[][]){
        System.out.println(" element in the maxtrix  ");

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("Enter the rows in 1st Matrix");
        col1 = sc.nextInt();
        System.out.println("Enter the col in 1st Matrix");
        row1 = sc.nextInt();
        int arr1[][] = new int[row1][col1];
        System.out.println(" Enter the maxtix value");
        for(int i=0; i<arr1.length; i++){
            System.out.println("enter the "+ i+ " rows value");
            for(int j=0; j<arr1[0].length; j++){
                arr1[i][j] =sc.nextInt();
            }
        }

        System.out.println("Enter the rows in 2nd Matrix");
        col2 = sc.nextInt();
        System.out.println("Enter the col in 2nd Matrix");
        row2 = sc.nextInt();
        int arr2[][] = new int[row2][col2];

        for(int i=0; i<arr1.length; i++){
            System.out.println("enter the "+ i+ " rows value");
            for(int j=0; j<arr1[0].length; j++){
                arr2[i][j] =sc.nextInt();
            }
        }
        System.out.println("size of the row array is "+arr1.length);
        System.out.println("size of the col array is "+arr1[0].length);

        print(arr1);


        int sum[][]=mulit(arr1, arr2);
       print(sum);
      
    }
    
}
