package ernest;

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
        StringBuffer sb = new StringBuffer();
        while(n > 0) {
            sb.insert(0, (char)('A' + (n - 1) % 26));
            n = (n - 1) / 26;
        }
        return sb.toString();
    }
}
