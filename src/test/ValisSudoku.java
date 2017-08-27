package test;

public class ValisSudoku {

    public boolean isValidSudoku(char[][] board){
        if(board == null || board.length != 9 || board[0].length != 9)
            return false;
    for(int i =0; i<9 ; i++){
        boolean[] m =new boolean[9];
        for(int j =0; j<9 ; j++){
            if(board[i][j]!= '.'){
                if(m[(int) (board[i][j]-'1')]){
                    return false;
                }
                m[(int)(board[i][j]- '1')] = true;
            }
        }
    }
    for(int j=0;j<9;j++){
        boolean[] m = new boolean[9];
        for(int i =0;i<9;i++) {
            if(board[i][j] != '.'){
                if(m[(int)(board[i][j] - '1')]){
                    return false;
                }
                m[(int)(board[i][j]-'1')] = true; 
            }
        }
    }
    //pending
    return true;
    }
    
}
