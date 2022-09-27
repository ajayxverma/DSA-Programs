package Basics;

public class StringBuiler {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("a");
        s.append("5");
        s.append("y");
        s.append("h");
        s.append("d");
        s.deleteCharAt(0);
        s.deleteCharAt(0);
        System.out.println(s);
        System.out.println("Before reverse: "+s);
        s.reverse();
        System.out.println("After reverse: "+s);
       
        

        
    }
    
}
