package Strings;

public class recalling {
    static String sequence(int n){
        if(n==1) return "1";
        if(n==2) return "11";

        String str = "11";
       for (int i = 2; i <n; i++) {
        
    
            str+="$";
            String temp ="";
            int len = str.length();
            int count =1;
            char[] arr = str.toCharArray();
            for (int j = 1; j <len; j++) {
                if(arr[j]!=arr[j-1]){
                    temp+=count+0;
                    temp+=arr[j-1];

                }else{
                    count+=1;
                }
                
            }
            str = temp;
        }


        return str;
    }



    public static void main(String[] args) {
        int n =5;
       System.out.println(sequence(n));

        
    }
    
}
