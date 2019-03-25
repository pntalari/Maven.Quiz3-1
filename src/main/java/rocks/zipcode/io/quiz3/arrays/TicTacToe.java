package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] tttBoard;

    public TicTacToe(String[][] board) {
        this.tttBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return tttBoard[value];
    }

    public String[] getColumn(Integer value) {
        String[] colRet = new String[this.tttBoard.length];
        for (int i = 0; i <3 ; i++) {
            colRet[i] = this.tttBoard[i][value];
        }
        return colRet;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for (int i =0;i<tttBoard.length;i++){
            if(tttBoard[rowIndex][0] == tttBoard[rowIndex][1] && tttBoard[rowIndex][2] == tttBoard[rowIndex][0]){
                return true;
            }
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int i =0;i<tttBoard.length;i++){
            if(tttBoard[0][columnIndex] == tttBoard[1][columnIndex] && tttBoard[2][columnIndex] == tttBoard[0][i]){
                return true;
            }
        }
        return false;
    }

    public String getWinner() {
        for (int i =0;i<tttBoard.length;i++){
            if(tttBoard[0][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][2]){
                return tttBoard[0][0];
            }
            if(tttBoard[0][2] == tttBoard[1][1] && tttBoard[0][2] == tttBoard[2][0]){
                return tttBoard[0][2];
            }

            if(isColumnHomogeneous(0) || isRowHomogenous(0)){
                return tttBoard[0][0];
            }
            if(isColumnHomogeneous(1) || isRowHomogenous(1)){
                return tttBoard[1][1];
            }
            if(isColumnHomogeneous(2) || isRowHomogenous(2)){
                return tttBoard[2][2];
            }
        }
        return null;
    }

    public String[][] getBoard() {

        return this.tttBoard;
    }
}
