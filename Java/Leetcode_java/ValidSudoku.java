

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
       HashSet<String> ss = new HashSet<>();
        int len = board.length;
        int len2 = board[0].length;
        if(len != len2) return false;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(board[i][j] != '.'){
                    if(!ss.add("row"+i+board[i][j]) || !ss.add("column"+j+board[i][j]) ) {
                         return false;
                    }                     
                    if(!ss.add("box"+ (i/3)*3+j/3+board[i][j])) return false;
                }                
            }
        }
        return true; 
    }
    public static void main(String[] args) {

       char[][] board = 
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
        
    }
}