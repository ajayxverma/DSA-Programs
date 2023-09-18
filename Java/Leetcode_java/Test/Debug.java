package Test;


import java.util.Arrays;

public class Debug {
 
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s : operations){
            if(s=="--X" || s=="--x"){
               --x;  
            }
            if(s=="X--" || s=="x--"){
               x--;  
            }
            if(s=="X++" || s=="x++"){
               x++;  
            }
            if(s=="++X" || s=="++x"){
               ++x;  
            }
            
        }
        return x;
        
    }
    public static void main(String[] args) {
       String[] operations = {"++X","++X","X++"};
       //System.out.println(finalValueAfterOperations(operations));
       int[] arr = new int[20];
       for (int i = 0; i <10; i++) {
         arr[i]=i;
       }
       for (int i : arr) {
         System.out.print(i+", ");
       }
       String s =Arrays.toString(arr);
       System.out.println(arr.length);
       System.out.println(s);

       
       System.out.println(s.substring(0,1));
       
    }

    
}
