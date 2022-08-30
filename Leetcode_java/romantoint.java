package Leetcode_java;

public class romantoint {
    public static int tonum(char data){
        
        if(data == 'I' || data == 'i' ){
            return 1;
        }
        if(data == 'V'|| data == 'v' ){
            return 5;
        }
        if(data == 'X' || data == 'x'){
            return 10;
        }
        if(data == 'L' || data == 'l'){
            return 50;
        }
        if(data == 'C' || data == 'c'){
            return 100;
        }
        if(data == 'D'|| data == 'd'){
            return 500;
        }
        if(data == 'M'|| data == 'm'){
            return 1000;
        } 
        return 0;  
    }
    public static int romanToInt(String s){
      int sol =0, temp2 =0;
      for (int i = 1; i < s.length(); i++) {
        if(tonum(s.charAt(i-1)) < tonum(s.charAt(i))){
            temp2 = tonum(s.charAt(i));
            temp2= temp2-tonum(s.charAt(i-1));
            sol+= temp2;
            i++;
        } else {
            sol+=tonum(s.charAt(i-1));
        }

      }
      if(tonum(s.charAt(s.length()-2)) >= tonum(s.charAt(s.length()-1))){
        sol+=tonum(s.charAt(s.length()-1));
        
    }

      return sol;
    }
    
   


    public static void main(String[] args) {
     String s = "MCMXCIV";
     System.out.println(romanToInt(s));
     System.out.println(tonum(s.charAt(1)));

                 
        
    }
}
