package DSA;

import java.util.Scanner;

public class Reverseastring {


    public void reverse(String arr[], int start, int end){

        String temp;
        while(start<end){
            temp =arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public void print(String data[]){
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ->");
        }

    }
    public static void main(String[] args) {
        String arr[] = new String[6];

    Scanner sc = new Scanner(System.in);
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.next();
    }
    
    Reverseastring rev = new Reverseastring();

    rev.reverse(arr, 0, arr.length-1);

    rev.print(arr);
       
}
    
}
