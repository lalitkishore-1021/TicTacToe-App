import java.util.Random;

public class TicTacToeUC2 {


    static boolean isPlayer1Turn;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {


        tossAndAssign();


        displayResult();
    }


    static void tossAndAssign() {

        Random rand = new Random();


        int toss = rand.nextInt(2);

        if (toss == 0) {
            isPlayer1Turn = true;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            isPlayer1Turn = false;
            player1Symbol = 'O';
            player2Symbol = 'X';
        }
    }


    static void displayResult() {

        if (isPlayer1Turn) {
            System.out.println("Player 1 starts first!");
        } else {
            System.out.println("Player 2 starts first!");
        }

        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}