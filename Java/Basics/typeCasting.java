/*  byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
    short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
    int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1.
    long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.
    float: The float data type is a single-precision 32-bit IEEE 754 floating point.
    double: The double data type is a double-precision 64-bit IEEE 754 floating point.
    boolean: The boolean data type has only two possible values: true and false.
    char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
 */

/* 
Widening Primitive Conversion

byte to short, int, long, float, or double

short to int, long, float, or double

char to int, long, float, or double

int to long, float, or double

long to float or double

float to double
 */
/*
Narrowing Primitive Conversion

 short to byte or char

char to byte or short

int to byte, short, or char

long to byte, short, char, or int

float to byte, short, char, int, or long

double to byte, short, char, int, long, or float 
*/


package Basics;


public class typeCasting {

    static void impcasting1(){
         // byte to short, int, long, float, or double
        byte a = 1;
        short b = a;
        System.out.println( b);
        int c = a;
        long d = a;
        float e = a;
        double f = a; 
        System.out.println("Value of Byte"+ a+  '\n' + "Value of short"+b +'\n' + "Value of int "+c +'\n' + "Value of long "+d +'\n' + "Value of float "+e +'\n' + "Value of double "+f   );
    }

    public static void expcasting() {
        //double to long to int
        // Double datatype
        double d = 100.04;
 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
        long l = (long)d;
 
        // Explicit type casting
        int i = (int)l;

        System.out.println("Value of double"+ d+  '\n' +"Value of long" + l+  '\n' +"Value of int" + i+  '\n' );

    }
    private static void tobyte() {
        //Note: While assigning value to byte type the fractional part is lost and is reduced to modulo 256(range of byte).

        // Declaring byte variable
        byte b;
 
        // Declaring and initializing integer and double
        int i = 257;
        double d = 323.142;
 
        // Display message
        System.out.println("Conversion of int to byte.");
 
        // i % 256
        b = (byte)i;
 
        // Print commands
        System.out.println("i = " + i + " b = " + b);
        System.out.println(
            "\nConversion of double to byte.");
 
        // d % 256
        b = (byte)d;
 
        // Print commands
        System.out.println("d = " + d + " b= " + b);
    }
    private static void inttoString() {
        int i=200; 
        int j =400;
        String ss = Integer.toString(j); 
        String s=String.valueOf(i);  
        System.out.println(i+100);//300 because + is binary plus operator  
        System.out.println(s+100);//200100 because + is string concatenation operator  
        System.out.println("Convertion using Integer.toString() :"+j);
        String s1 = Integer.toString(i);
        System.out.println("Integer to Stirng using toSgring(): "+s1);
    }
    private static void longtoString() {
        long i=9993939399L;  
        String s=Long.toString(i);  
        System.out.println(s); 
        String s1=Long.toString(i);  
        System.out.println(s1);   


    }
    private static void floattoString() {
        float f=12.3F;//F is the suffix for float  
        String s=String.valueOf(f);  
        System.out.println(s); 
        String s1=Float.toString(f);  
        System.out.println(s1);   
    }
    
    private static void doubletoString() {
        double d=12.3;  
        String s=String.valueOf(d);  
        System.out.println(s);  
        String s1=Double.toString(d);  
        System.out.println(s1); 
    }

    public static void main(String[] args) {
        // byte to short, int, long, float, or double
        //impcasting1();
        expcasting();
        tobyte();
        inttoString();
        longtoString();
        floattoString();
        doubletoString();
        
    }


   

   

  

    



  
    
}
