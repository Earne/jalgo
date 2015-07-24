/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * click to show spoilers.
 * Some hints:
 * <p>
 * Could negative integers be palindromes? (ie, -1)
 * <p>
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * <p>
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer",
 * you know that the reversed integer might overflow. How would you handle such case?
 * <p>
 * There is a more generic way of solving this problem.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x < 10)
            return true;
        int length = (int) Math.log10(x);
        for (int i = length; i > length / 2; i--) {
            if ((x / (int) Math.pow(10, length - i)) % 10 != (x / (int) Math.pow(10, i)) % 10)
                return false;
        }
        return true;
    }
}
