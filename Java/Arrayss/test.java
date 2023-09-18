package Arrayss;

import java.util.Scanner;

public class test {

    public static int calPoints(String[] operations) {
        int len=operations.length;
        int sum=0,p1,p2=0;
        p1=0;
        int[] sol = new int[operations.length];
        int count=0;
        for(int i=0; i<len; i++){
            if(Character.isDigit(operations[i].charAt(0))){
                sol[p2]=Integer.parseInt(operations[i]);
                p1=p2;
                p2++;
               
            } else if(operations[i]=="+"){
                sol[p2]=sol[p1]+sol[p1-1];
                p1=p2;
                p2++;
            } else if(operations[i]=="D"){
                sol[p2]=sol[p1]*2;
                p1=p2;
                p2++;
                
            } else if(operations[i]=="C"){
                sol[p2-1]=0;
                p2=p2-1;
                p1=p2-1;
                
                
            }
        }
               for(int i=0; i<sol.length; i++){
                   sum+=sol[i];
               }
               return sum;
    }
    public static void main(String[] args) {
        String arr[] = {"5","-2","4","C","D","9","+","+"};

         System.out.println(calPoints(arr));   

    }
    
    
}
