package corejavaarrays;

import java.util.Arrays;


public class Java2DArrays {
    
    public static void main(String[] args) {
        char[][] board= new char[3][3];

        // FILLING IN THE ARRAY WITH EMPTY DASHED WITH A NESTED LOOP. Method 1
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
            
        }

        // FILLING IN THE ARRAY WITH EMPTY DASHED WITHOUT A NESTED LOOP. Method 2
        char[][] boardTwo = new char[][]{
            new char[]{'0', '-', '-'},
            new char[]{'0', '-', '-'},
            new char[]{'0', '-', '-'}

        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));

    }
}
