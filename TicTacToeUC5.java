public class TicTacToeUC5 {

    // 3x3 board with empty cells '-'
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        boolean result = isValidMove(row, col);

        System.out.println("Move at (" + row + "," + col + ") valid? " + result);
    }

    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}