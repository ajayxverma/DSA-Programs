import java.util.Scanner;

public class reverse {

    public static void revers(char[] arr){
        int counter=0,counter2 =arr.length-1;
        while(counter<counter2){
            char temp =arr[counter2];
            arr[counter2]=arr[counter];
            arr[counter]= temp;
            counter++;
            counter2--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        
        String s = sc.nextLine();

        char arr[] = new char[s.length()];
        for(int i =0; i<s.length(); i++){

            //to convert char to Array use charAt() to find the index of the char 
            arr[i] = s.charAt(i);
        }
        revers(arr);
        for( char c : arr){
            System.out.println("char in arr = "+c);
        }

        System.out.println("The string is: "+ s);
    }
    
}
