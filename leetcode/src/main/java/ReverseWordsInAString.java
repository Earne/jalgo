/**
 * @author gengyuanzhen
 */
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }

        StringBuilder ans = new StringBuilder();

        for (int i=s.length()-1, j; i>=0; i--) {
            if (s.charAt(i) != ' ') {
                j = i; // j is pointing to the end char of the current word
                i = s.lastIndexOf(' ', i); // this returns the white space preceding the current word
                ans.append(s, i+1, j+1).append(" ");
            }
        }

        // if (ans.length() > 0) {
        //     ans.deleteCharAt(ans.length()-1);
        // }

        return ans.toString().trim();
    }
}
