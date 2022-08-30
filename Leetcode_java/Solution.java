package Leetcode_java;

class Solution {  
    public static char tonum(int data){

        if(data == 1){
            return 'I';
        }
        if(data == 5 ){
            return 'V';
        }
        if(data == 10){
            return 'X';
        }
        if(data == 50){
            return 'L';
        }
        if(data == 100){
            return 'c';
        }
        if(data ==500){
            return 'D';
        }
        if(data == 1000){
            return 'M';
        } 
        return 0;  
    }
    public static int romanToInt(String s){
      int sol =0;
      StringBuilder ne = new StringBuilder();
      
      

      return sol;
    }
    
   


    public static void main(String[] args) {
     String s = "MCMXCIV";
     System.out.println(romanToInt(s));
     System.out.println(tonum(s.charAt(1)));

                 
        
    }
}