package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                   result = false;
                   break;
                }

        }
        return result;

    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length - 1; i++) {
            if ((board[i][column] & board[i + 1][column]) != 'X') {
                result = false;
                break;
            }

        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int row = 0; row < board.length; row++) {
            rsl[row] = board[row][row];
        }
        return rsl;
    }
}
