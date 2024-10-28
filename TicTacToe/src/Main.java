
import TicTacToe.Game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic-Tac-Toe");
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.\tPlay");
            System.out.println("2.\tEXIT");
            System.out.print("Select an option: ");
            int choice = scan.nextInt();
            if (choice == 1) {
                Game game = new Game();
                if( !game.startGame() ){
                    System.out.println("\t\t\tMatch Drawn");
                }
                else System.out.println("check here");
            } else break;

        }

    }
}