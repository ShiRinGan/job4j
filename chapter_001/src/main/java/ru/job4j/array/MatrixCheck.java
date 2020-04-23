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
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int j=0; j<board.length-2; j++) {
            for (int index=0; index<board.length-2; index++){
            if (board[j][column] != board[j][column+index]) {
                result = false;
                break;
            }}
        }
        return result;
    }
}
