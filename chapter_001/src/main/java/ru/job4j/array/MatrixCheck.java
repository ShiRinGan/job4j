package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = true;
            for (int i=0; i<board.length-1; i++) {
                for (int index=0; index<board.length-1; index++){
                if (board[row][i] != board[row][i+index]) {
                    result = false;
                    break;
                }}
            }
            return result;
        }
}
