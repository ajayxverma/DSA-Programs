import java.util.Arrays;

public class StringOperation {

    public static void main(String[] args) {

        String s1 ="apple";
        String s2 = "have a nice apple day";
        String s3 = "A man, a plan, a canal: Panama";
        System.out.println("the length of the s1 is "+ s1.length());
       

        //finds the string in s1 in s2
        System.out.println(s2.indexOf(s1)); 
        //Retruns the substring form the starting mention index to the mention index
        System.out.println(s1.substring(1, 3));
        // Returns the chaaracter at the given index
        System.out.println(s1.charAt(3));
        // Retruns the legth including the space
        System.out.println(s1.length());

        // Remove all the space in the String
        s2 = s2.replaceAll("\\s", "");

       System.out.println(s2);

       //Replace all the space and special characters in an string 
       s3 = s3.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s3);
        
        System.out.println( s3.charAt(3));
       //Declaring String variable  
        String s="200";  
        //Converting String into int using Integer.parseInt()  
        int i=Integer.parseInt(s);  
        //Printing value of i  
        System.out.println(i);  

        int b=200;  
        String a=String.valueOf(i);  
        System.out.println(b+100);//300 because + is binary plus operator  
        System.out.println(a+100);//200100 because + is string concatenation operator  

        ///String to Double
        String sf="23.6";  
        double d=Double.parseDouble(sf);  
        System.out.println(d);

        //string to long
        String lo="9990449935";  
        long lon=Long.parseLong(lo);  
        System.out.println(lon);  

        //Remove whitespace from both sides of a string:
        String myStr = "       Hello World!        ";
        System.out.println(myStr);
        System.out.println("Remove whitespace from both sides of a string: "+myStr.trim());

        //
        String s5 = "fly me   to   the moon  ";
         s5= s5.trim();
        int result =s5.substring(s5.lastIndexOf(" ") + 1).length();
        System.out.println("the last word length of substring is "+result);


        //sorting of String using Sort()
        String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);


       
  

        
    }
    
}
