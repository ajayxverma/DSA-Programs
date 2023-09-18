
class MergeStringsAlternately1768 {
    public static void main(String[] args) {

        String sol = mergeAlternately("abc", "pqr");

        System.out.println(sol);

    }

    // This is more faster approach
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int len1 = word1.length(), len2 = word2.length();

        int i = 0, j = 0;

        while(i < len1 || j < len2) {
            if(i < len1 ) {
                sb.append(word1.charAt(i));
                i++;
            }
            if(j < len2) {
                sb.append(word2.charAt(j));
                j++;
            }
        }

        return String.valueOf(sb);

    }

    /*
     * public static String mergeAlternately(String word1, String word2) {
     * 
     * int mlen = Math.min(word1.length(), word2.length());
     * String sol = "";
     * for (int i = 0; i < mlen; i++) sol = sol+ word1.charAt(i) + word2.charAt(i);
     * 
     * return mlen == word1.length() ? sol + word2.substring(mlen, word2.length()) :
     * sol + word1.substring(mlen, word2.length()) ;
     * 
     * }
     */

    // itereatable apporach
    /*
     * public static String mergeAlternately(String word1, String word2) {
     * 
     * int len1 = word1.length();
     * int len2 = word2.length();
     * char[] word1c = word1.toCharArray();
     * char[] word2c = word2.toCharArray();
     * int count1 = 0;
     * int count2 = 0;
     * int mcount = 0;
     * char[] merg = new char[len1 + len2];
     * while (count1 < len1 && count2 < len2) {
     * merg[mcount++] = word1c[count1++];
     * 
     * merg[mcount++] = word2c[count2++];
     * 
     * }
     * while (count1 < len1) {
     * merg[mcount++] = word1c[count1++];
     * }
     * 
     * while (count2 < len2) {
     * merg[mcount++] = word2c[count2++];
     * 
     * }
     * 
     * for (char c : merg) {
     * System.out.print(c);
     * }
     * 
     * return String.valueOf(merg);
     * 
     * }
     */
}