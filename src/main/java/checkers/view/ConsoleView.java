package checkers.view;

import checkers.controller.GameController;
import checkers.model.Board;
import checkers.model.Move;

import java.util.Scanner;

public class ConsoleView {


    public void printBoard(String[][] boardArray) {
        System.out.println("    A   B   C   D   E   F   G   H  ");
        System.out.println("  ---------------------------------");
        for (int i = 0; i < boardArray.length; i++) {
            System.out.print((8 - i) + " |");
            for (int j = 0; j < boardArray.length - 1; j += 2) {
                if (i % 2 == 0) {
                    System.out.print("   |");
                    if (boardArray[j + 1][i] == " " || boardArray[j + 1][i] == null) {
                        System.out.print("\u001B[40m" + "   " + "\u001B[0m" + "|");
                    } else {
                        System.out.print("\u001B[40m" + "\u001B[37m" + " " + boardArray[j + 1][i] + " " + "\u001B[0m" + "|");
                    }
                } else {
                    if (boardArray[j][i] == " " || boardArray[j][i] == null) {
                        System.out.print("\u001B[40m" + "   " + "\u001B[0m" + "|");
                    } else {
                        System.out.print("\u001B[40m" + "\u001B[37m" + " " + boardArray[j][i] + " " + "\u001B[0m" + "|");
                    }
                    System.out.print("   |");
                }
            }
            System.out.println(" " + (8 - i) + "\n  ---------------------------------");
        }
        System.out.println("    A   B   C   D   E   F   G   H  ");
    }

    public String[] getmove() {
        String[] result = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ruch Z:");
        result[0] = sc.nextLine();
        System.out.println("Podaj ruch DO:");
        result[1] = sc.nextLine();
        return result;
    }

    public void run() {
        Board board = new Board();
        Move move = new Move();
        boolean test = true;
        printBoard(board.getBoardArray());
        GameController gameController = new GameController();

        while (test) {
            String[] tempMove = getmove();
            if (gameController.controller(tempMove, board.getBoardArray())) {
                move.move(tempMove, board.getBoardArray());
                printBoard(board.getBoardArray());
            } else {
                System.out.println("Bledny ruch");
            }
        }

    }

}
