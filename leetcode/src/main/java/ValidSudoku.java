import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * <p>
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * <p>
 * <p>
 * A partially filled sudoku which is valid.
 * <p>
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                Set<Character> R = new HashSet<Character>();
                Set<Character> C = new HashSet<Character>();
                Set<Character> D = new HashSet<Character>();

                for (int k = 0; k < board[0].length; k++) {
                    if (k != j && board[i][j] != '.')
                        R.add(board[i][k]);
                }

                for (int k = 0; k < board.length; k++) {
                    if (k != i && board[i][j] != '.')
                        C.add(board[k][j]);
                }

                for (int k = (i / 3) * 3; k < (i / 3) * 3 + 3; k++) {
                    for (int l = (j / 3) * 3; l < (j / 3) * 3 + 3; l++) {
                        if (k != i && l != j && board[i][j] != '.')
                            D.add(board[k][l]);
                    }
                }

                if (R.contains(board[i][j]) || C.contains(board[i][j]) || D.contains(board[i][j]))
                    return false;
            }
        }
        return true;
    }

    // TODO update this
}
