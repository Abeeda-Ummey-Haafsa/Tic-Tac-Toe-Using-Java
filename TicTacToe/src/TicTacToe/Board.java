package TicTacToe;

public class Board {
    char[][] boardArray;
    boolean displayBoard;

    public Board() {
        boardArray = new char[3][3];
        char track = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardArray[i][j] = track;
                track++;
            }
        }
        displayBoard = false;
    }

    public void boardDisplay(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) System.out.print("        "+boardArray[i][j]);
            System.out.println();
        }
    }

    // check if the current move is valid or not
    public boolean checkForValidMove(int move, char symbol){
        if(move<1 || move>9){
            System.out.println("\t\t\tInvalid move ! ! ! ");
            return false;
        }
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if ( boardArray[i][j] == (char)(move + '0') ){
                        boardArray[i][j] = symbol;
                        return true;
                    }
                }
            }
            System.out.println("\t\t\tInvalid move ! ! ! ");
            return false;
        }
    }

    // check if the current player has won the game or not
    public boolean checkWin(char currentPlayer) {
        return (checkRows(currentPlayer) || checkColumns(currentPlayer) || checkDiagonals(currentPlayer));
    }

    // Check rows for win
    public boolean checkRows(char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (boardArray[i][0] == currentPlayer && boardArray[i][1] == currentPlayer && boardArray[i][2] == currentPlayer) return true;
        }
        return false;
    }

    // Check columns for win
    public boolean checkColumns(char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if (boardArray[0][i] == currentPlayer && boardArray[1][i] == currentPlayer && boardArray[2][i] == currentPlayer) return true;
        }
        return false;
    }

    // Check diagonals for win
    public boolean checkDiagonals(char currentPlayer) {
        return (boardArray[0][0] == currentPlayer && boardArray[1][1] == currentPlayer && boardArray[2][2] == currentPlayer) ||
                (boardArray[0][2] == currentPlayer && boardArray[1][1] == currentPlayer && boardArray[2][0] == currentPlayer);
    }


}

