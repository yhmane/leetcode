package leetcode.prefix;

public class Prefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs[0].length();

        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if( i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }

        }
        return strs[0];
    }
}
