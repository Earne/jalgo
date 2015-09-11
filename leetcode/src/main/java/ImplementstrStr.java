/**
 * Implement strStr().
 * <p>
 * Returns the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <p>
 * Update (2014-11-02):
 * The signature of the function had been updated to return the index instead of the pointer.
 * If you still see your function signature returns a char * or String,
 * please click the reload button to reset your code definition.
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int result = -1;
        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (j < needle.length() && i + j < haystack.length() && haystack.charAt(i + j) == needle
                    .charAt(j))
                j++;
            if (j == needle.length())
                return i;
        }
        return result;
    }

    public int strStr2(String haystack, String needle) {
        if (haystack.contains(needle))
            return haystack.indexOf(needle);
        return -1;
    }

    // KMP Version
    public int strStr3(String haystack, String needle) {
        int res = -1;
        if (needle == null || needle.length() == 0)
            return -1;

        int[] next = new int[needle.length() + 1];
        next[1] = 0;
        // calculate the next array
        int i = 1, j = 0;
        while (i < needle.length()) {
            if (j == 0 || needle.charAt(i - 1) == needle.charAt(j - 1)) {
                ++i;
                ++j;
                // optimize
                if (needle.charAt(i - 1) == needle.charAt(j - 1)) {
                    next[i] = next[j];
                } else {
                    next[i] = j;
                }
            } else {
                j = next[j];
            }
        }

        // KMP
        i = 1;
        j = 1;
        while (i <= haystack.length() && j <= needle.length()) {
            if (j == 0 || haystack.charAt(i - 1) == needle.charAt(j - 1)) {
                ++i;
                ++j;
            } else {
                j = next[j];
            }
        }

        if (j > needle.length())
            return i - j;
        return res;
    }

}
