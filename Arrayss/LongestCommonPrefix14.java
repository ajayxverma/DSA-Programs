
class LongestCommonPrefix14 {
    public static void main(String[] args) {
        String[] sarr = { "flower", "flow", "flight" };

        System.out.println(longestCommonPrefix(sarr));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        String sol = "";
        sol.substring(0, 0)
        int len = strs[0].length();

        for (int i = 0; i < len; i++) {
            char tc = strs[0].charAt(i);
            Boolean check = true;
            int arrlen = strs.length;
            for (int j = 0; j < arrlen; j++) {
                if(i => ch) {
                    check = false;
                    break;

                }
                if(tc != strs[j].charAt(i)) {
                    check = false;
                    break;
            }
            if(check) {
                sol = sol + tc;
            } else {
                break;
            }
            }
        }
        return sol;
    }
}