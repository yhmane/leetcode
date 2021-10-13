package leetcode.implementStrStr;

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        int length = needle.length();

        for (int i = 0; i < haystack.length() - length + 1; i++) {
            if (haystack.substring(i, i + length).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
