package Strings;
import java.util.*;

//Check if the given string is shuffled substring of another string
public class shuffledsubstrings {

    public static boolean findsubstring(String a, String b){
        int n = a.length();
        int m = b.length();

        if(a.length() > b.length()) return false;

        a=sort(a);
        System.out.println("The String to be compared with is:"+a);
        for (int i = 0; i <m; i++) {

            if(i+n-1>=m) return false;

            String temp ="";

            for (int j = 0; j <n; j++) {

                temp+=b.charAt(i+j); 
            }
            temp=sort(temp);
            System.out.println(temp);
            if(temp.equals(a)){
                return true;
            }
            
            
        }
        


        return false;
    }
 
public static String sort(String a) {

    char tempArray[] = a.toCharArray();
     
    // sort tempArray
     Arrays.sort(tempArray);
     
    // return new sorted string
    return String.valueOf(tempArray);
    
  }

    public static void main(String[] args) {
        String a = "onetwofour";
        String b = "hellofourtwooneworld";

       if( findsubstring(a, b)){
        System.out.println("True");
       }else{
        System.out.println("False");;
       }

    }
    
}
