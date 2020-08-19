/**
 * @author gengyuanzhen
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        char[][] isVisit = new char[board.length][board[0].length];
        for (int p = 0; p < board.length; p++) {
            for (int q = 0; q < board[0].length; q++) {
                if (visit(board, isVisit, word, 0, p, q)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean visit(char[][] board, char[][] isVisit, String word, int index, int p, int q) {
        if (index == word.length()) {
            return true;
        }
        if (p < 0 || p >= board.length || q < 0 || q >= board[0].length
                || isVisit[p][q] == 1 || board[p][q] != word.charAt(index)) {
            return false;
        }

        isVisit[p][q] = 1;
        boolean result = visit(board, isVisit, word, index + 1, p + 1, q)
                || visit(board, isVisit, word, index + 1, p - 1, q)
                || visit(board, isVisit, word, index + 1, p, q + 1)
                || visit(board, isVisit, word, index + 1, p, q - 1);
        isVisit[p][q] = 0;
        return result;
    }
}
