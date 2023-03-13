package Strings.Test;
import java.util.*;
public class DebugCode2 {
// Java program to find the longest
// repeatings ubsequence


    public static boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2; i++){
            int temp=n;
            String s="";
            while(temp>0){
                int t=temp%i;
                temp/=i;
                s+=Integer.toString(t); 
            }
            if(palindromic(s)){
                return false;
            }
        }
      return true;  
    }
    
    public static boolean palindromic(String s){
            StringBuilder sb = new StringBuilder(s);
			StringBuilder sb2 = sb.reverse();
       if(sb.toString().equals(sb2.toString())){
           return true;
       } 
        
        
        return false;
    }
	// driver program to check above function
	public static void main (String[] args)
	{
		
		System.out.println(isStrictlyPalindromic(4));
		String str = "Hello";
		String str2 = "HelLo";
	

	}
}

// This code is contributed by Pramod Kumar


    
