

class Solution {
        public static int myAtoi(String s) {
            char ss[] =s.toCharArray();
            StringBuilder sol = new StringBuilder();
            int p =0;
            int np = 1;
            while(p<s.length()){
                if(s.charAt(p)=='-'){
                    np =-1;
                } 
                if(ss[p]==' '){
                    p++;
                    continue;
                    
                } else if(!Character.isDigit(ss[p])){
                    sol.append('0');
                   break;
                } else if(Character.isDigit(ss[p])){
                     sol.append(ss[p]);;
                } else {
                    
                }
                p++;
            }

            String ra = sol.toString();
    
           int re = Integer.parseInt(ra);
            return re;
        }

    public static void main(String[] args) {
    double x = 2;
    String n = "a135234";
    int sol = myAtoi(n);
    System.out.println(sol);


                 
        
    }
}