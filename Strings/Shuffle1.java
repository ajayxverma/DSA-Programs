package Strings;

public class Shuffle1 {

    public static String restoreString(String s, int[] indices) {
        char[] str = s.toCharArray();
        char[] res = new char[indices.length];
        for(int i = 0; i < indices.length; i++ ){

            res[i] = str[indices[i]];
        }

        return String.valueOf(res);


    }
    public static void main(String[] args) {
       
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        String sol = restoreString(s,arr);
    }
    
}
