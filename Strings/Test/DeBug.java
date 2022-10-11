package Strings.Test;

public class DeBug{
  
        public static String perfect(String a) {
           
           int len = a.length();

            StringBuilder sb = new StringBuilder();
         for (int i = 0; i <len; ++i) {
            char c = a.charAt(i);
            if( sb.length()>0 && (sb.charAt(sb.length() - 1)^32)==c){
                sb.deleteCharAt(sb.length() - 1);
            } else{
                sb.append(c);
            }
         }
       

           return sb.toString();
            
        }

        public static int percentageLetter(String s, char letter) {
            float n =0;
            int len=s.length();
            for(int i=0; i<len; i++){
                if(s.charAt(i)==letter){
                    n+=1;
                }
                
            }
             n=(n/len)*100;
            return (int)n;
        }

       
            public static String reverseVowels(String s) {
                char[] arr = s.toCharArray();
                 int len = arr.length-1;
                for(int i=0; i<len; ){
                    if(arr[i]=='a' || arr[i]=='i' ||arr[i]=='e' || arr[i]=='o' || arr[i]=='u'){
                        
                       if(arr[len]=='a' || arr[len]=='i' ||arr[len]=='e' || arr[len]=='o' || arr[len]=='u'){
                        
                           char temp = arr[i];
                           arr[i]=arr[len];
                           arr[len]=temp;
                           len--;
                           i++;
                           
                    } else {
                           len--;
                       }
                } else {
                        i++;
                    }
                        
                    
                }                                  
                                                   
                 return new String(arr);                                  
                
            }
    public static void main(String[] args) {
       // String a="aAbBcCaaaa";
       //System.out.println(perfect(a)); 

       //int n= percentageLetter("foobar",'o');
       //System.out.println("the percentage of char is : "+n);
       String s = "hello";
      System.out.println(reverseVowels(s)); 
    }
}