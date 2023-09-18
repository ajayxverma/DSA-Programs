package Strings;

import java.util.ArrayList;
import java.util.List;

import Stacks_Queues.stackimp.stack;

public class Allsubsequencesofastring {

   static List<String> ans= new ArrayList<>();

    public static void subsequence(String str, String s){
        if(str.length()==0){
            ans.add(s);
            return;
        }
        subsequence(str.substring(1), s+str.charAt(0));

        subsequence(str.substring(1),s);
         
    }

    public static void main(String[] args) {

        subsequence("abc", "");
        System.out.println(ans);
        
    }
    
}
