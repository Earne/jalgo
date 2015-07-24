/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            result = (char) (((n - 1) % 26) + 'A') + result;
            n = (n - 1) / 26;
        }
        return result;
    }
}
