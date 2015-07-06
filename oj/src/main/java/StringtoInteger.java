/**
 * Implement atoi to convert a string to an integer.
 * <p>
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * <p>
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 * <p>
 * Update (2015-02-10):
 * The signature of the C++ function had been updated.
 * If you still see your function signature accepts a const char * argument,
 * please click the reload button to reset your code definition.
 * <p>
 * spoilers alert... click to show requirements for atoi.
 * Requirements for atoi:
 * <p>
 * The function first discards as many whitespace characters as necessary
 * until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus sign followed by
 * as many numerical digits as possible, and interprets them as a numerical value.
 * <p>
 * The string can contain additional characters after those that form the integral number,
 * which are ignored and have no effect on the behavior of this function.
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid integral number,
 * or if no such sequence exists because either str is empty or it contains only whitespace characters,
 * no conversion is performed.
 * <p>
 * If no valid conversion could be performed, a zero value is returned.
 * If the correct value is out of the range of representable values, INT_MAX (2147483647)
 * or INT_MIN (-2147483648) is returned.
 */
public class StringtoInteger {
    public int myAtoi(String str) {
        long result = 0;
        str = str.trim();
        int i = 0;
        boolean isPositive = true;
        while (i < str.length() - 1 && Character.isSpaceChar(str.charAt(i)))
            i++;

        if (i == str.length())
            return 0;

        switch (str.charAt(i)) {
            case '-':
                isPositive = false;
                i++;
                break;
            case '+':
                isPositive = true;
                i++;
                break;
            default:
                break;
        }

        for (int j = i; j < str.length() && result < Integer.MAX_VALUE && Character.isDigit(str
                .charAt(j));
             j++) {
            result = result * 10 + str.charAt(j) - '0';
        }

        if (!isPositive)
            result = 0 - result;

        if (result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            result = Integer.MIN_VALUE;

        return (int) result;
    }
}
