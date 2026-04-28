public class TicTacToe {
    static boolean isHumanTurn = true;
    static boolean gameOver = false;
    public static void main(String[] args) {
        startGameLoop();
    }
    static void startGameLoop() {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human turn");
            } else {
                System.out.println("Computer turn");
            }

            checkGameStatus();
            isHumanTurn = !isHumanTurn;
        }

        System.out.println("Game Over");
    }
     */
    static void checkGameStatus() 
        double random = Math.random();

        if (random < 0.3) {
            gameOver = true;
        }
    }
}
