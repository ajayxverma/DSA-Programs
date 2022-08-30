/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. 

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

*/


package Leetcode_java;

public class validPalindrome {

        public static boolean isPalindrome(String s) {
            
           s= s.replaceAll("[^a-zA-Z0-9]","");
            int first =0, last=s.length()-1;
            while(last>first){
                if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
                    return false;
                }
                first++;
                last--;
            }  
        return true;
        
        }
    public static void main(String[] args) {
        

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
    }

