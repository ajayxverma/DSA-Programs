package Strings;

public class StringMatchingArray {
    public static String[] matchingStrngArray(String[] s){
        String[] sol = new String[s.length];
        int n=0;
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                if(i!=j && s[j].contains(s[i])){
                    sol[n++]=s[i];
                }
            }  
        }
        return sol;

        
    }


    public static void main(String[] args) {
        String[] s = {"mass","as","hero","superhero"};
       String[] sol= matchingStrngArray(s);
       for (String str : sol) {
            System.out.println(str);
       }
       String d = "hro";
       String a = "he";
       System.out.println(d.contains(a));


    }
    
}
