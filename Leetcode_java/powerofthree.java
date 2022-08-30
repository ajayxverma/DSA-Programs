/* Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

Example 1:

Input: n = 27
Output: true
Example 2:

Input: n = 0
Output: false */


package Leetcode_java;

public class powerofthree {
    public static boolean isPowerOfThree(int n) {
        int count =0; 
        double a =n;
        if(a == 1){
            return true;
        } else{
            while(a>1){
                a/=3;
                count++;
                }
            if(a != 1){
                return false;    
            }
        }
        return true;   
    }

    public static void main(String[] args) {
        int n=26;
        System.out.println( isPowerOfThree(n));
       
    }
}

