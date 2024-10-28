package TicTacToe;

import java.util.Scanner;

public class Player {
   String playerName;
    char symbolForPlayer;

    Player(String playerName, char symbolForPlayer){
        this.playerName = playerName;
        this.symbolForPlayer = symbolForPlayer;

    }
    Scanner scan = new Scanner(System.in);
//    public int getRow(){
//        System.out.print("Enter row no. : ");
//        int i = scan.nextInt();
//        return i;
//    }
//    public int getColumn(){
//        System.out.print("Enter col no. : ");
//        int j = scan.nextInt();
//        return j;
//    }

    public int getMove(){
        System.out.print("Select Move : ");
        int move;
        return move = scan.nextInt();
    }
}
