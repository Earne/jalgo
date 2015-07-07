/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * <p>
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    // add a array to store each line
    public String convert2(String s, int numRows) {
        String[] lines = new String[numRows];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
        }
        int row = 0;
        int dir = -1;
        for (int i = 0; i < s.length(); i++) {
            lines[row] += s.charAt(i);
            if (row == 0 || row == numRows - 1)
                dir = 0 - dir;
            row += dir;
            row = row % numRows;
        }

        String result = "";
        for (String line : lines)
            result += line;
        return result;
    }

    // fefact this O(1) space solution
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder sb = new StringBuilder();
        boolean isZ;
        int index;
        for (int i = 0; i < numRows; i++) {
            index = i;
            isZ = false;
            int A = 2 * (numRows - i - 1);
            int B = 2 * i;
            while (index < s.length()) {
                sb.append(s.charAt(index));
                if (i == 0)
                    index += A;
                else if (i == numRows - 1)
                    index += B;
                else if (!isZ)
                    index += A;
                else index += B;
                isZ = !isZ;
            }
        }
        return sb.toString();
    }
}
