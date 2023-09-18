/* Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 */

package Strings;

public class ReverseStringII {

   public static String reversess(String s, int k){
        
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i=i+2*k) {
            int start = i, end = i+k-1<len ? i+k-1 : len-1; 
            while (start<end) {
                char temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
                
            }
            
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str="abcdefg";
       String sol = reversess(str, 2);
        System.out.println(sol);
        
        
    }
}
