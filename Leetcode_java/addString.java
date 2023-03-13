/* Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Input: num1 = "11", num2 = "123"
Output: "134" */



import java.math.BigInteger;

class addString {
    public static String addStrings(String num1, String num2) {
        BigInteger n1 =new BigInteger(num1);
        BigInteger n2 =new BigInteger(num2);
        
        BigInteger sum = n1.add(n2);

        return sum.toString();
        
        
        
    }

    public static void main(String[] args) {

        String num1 = "12222222221", num2 ="222222222222";
        System.out.println(addStrings(num1,num2));


        
    }
}