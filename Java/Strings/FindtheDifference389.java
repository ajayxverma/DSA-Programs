import java.util.HashSet;

public class FindtheDifference389 {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));

    }

    public static char findTheDifference(String s, String t) {

        HashSet<Character> ucs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            ucs.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
          if(ucs.add(t.charAt(i))) {
            char c = t.charAt(i);
            return c;
          }  
        }
        char x = 'a';
        return x ;
    }
    
}
