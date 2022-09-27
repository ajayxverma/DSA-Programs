package Strings.Test;

class DeBug
{
    public static int repeactingsubsequence(String str){
        int len= str.length();
        char[] arr=str.toCharArray();
        int count=0;
       for (int i = 0; i < len; i++) {
        int tempcon=0;
        for (int j = i; j+1 < len; j++) {
            if(arr[j]==arr[j+1]){
                break;  
            } else{
                tempcon++;
            } 
        }
        if(tempcon>count) count=tempcon;
        
       }
        return count+1;

    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(repeactingsubsequence(str));
        

    }
}