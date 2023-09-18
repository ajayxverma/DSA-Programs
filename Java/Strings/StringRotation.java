package Strings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringRotation {

    public static boolean rotation(String a, String b){

        


        return (a.length()==b.length()) &&((a+a).indexOf(b) !=-1 );
    }
    public static boolean rotation2(String a, String b){
        if(a.length()!=b.length()) return false;
        Queue<Character> q1 = new LinkedList<>();

        for (int i = 0; i < a.length(); i++) {
            q1.add(a.charAt(i));  
        }
        Queue<Character> q2 = new LinkedList<>();

        for (int i = 0; i < b.length(); i++) {
            q2.add(b.charAt(i));  
        }
        int l = a.length();
        while(l>0){
            l--;
            char temp = q2.peek();
            q2.remove();
            q2.add(temp);
            if(q2.equals(q1)){
                return true;
            }


        }

        return false;

        }


    public static void main(String[] args) {
      
        String a ="Geek";
        String b ="eekG";
        System.out.println((a+a).indexOf(b)); 
       
      if(rotation2(a, b)){
        System.out.println(" is  Rotation");
      } else {
        System.out.println(" is not a Roatation");
      }

    }
    
}
