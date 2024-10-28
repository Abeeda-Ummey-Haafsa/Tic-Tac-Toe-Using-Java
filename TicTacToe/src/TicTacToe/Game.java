package TicTacToe;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;

    Board board = new Board();
    Scanner scan = new Scanner(System.in);

    boolean move = true;
    public boolean startGame(){
        // Creates new player
        for (int i = 0; i < 2; i++){
            System.out.print("Enter Player Name: ");
            String playerName = scan.nextLine();
            System.out.print("[ X / O] : ");
            char playerSymbol = scan.next().charAt(0);
            scan.nextLine();
            if(i==0)  player1 = new Player(playerName, playerSymbol);
            else  player2 = new Player(playerName, playerSymbol);
        }
        System.out.println("Hello Player: "+player1.playerName+ " & Player : "+player2.playerName);
        board.boardDisplay();

        int cnt = 0;
        while(cnt < 9) {
            int moveSelectedByPlayer;
            if (move) {
                System.out.println(player1.playerName+"'s move");
                while(true){
                    moveSelectedByPlayer = player1.getMove();
                    if ( board.checkForValidMove(moveSelectedByPlayer, player1.symbolForPlayer) ) break;
                }

                board.boardDisplay();
                if (board.checkWin(player1.symbolForPlayer) ){
                    System.out.println(("Congratulations!!! You Have Won The Game "+player1.playerName));
                    board.displayBoard = true;
                    break;
                }
                move=false;
            }

            else {
                System.out.println(player2.playerName+"'s move");
                while(true){
                    moveSelectedByPlayer = player2.getMove();
                    if ( board.checkForValidMove(moveSelectedByPlayer, player2.symbolForPlayer) ) break;
                }

                board.boardDisplay();
                if (board.checkWin(player2.symbolForPlayer) ){
                    System.out.println(("Congratulations ! ! ! You Have Won The Game "+player2.playerName));
                    board.displayBoard = true;
                    break;
                }

                move=true;
            }
            cnt++;
        }
        return board.displayBoard;

    }


}
