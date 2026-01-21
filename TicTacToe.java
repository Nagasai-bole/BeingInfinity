package beingInfinity;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    static String playerX;
    static String playerO;

    public static void main(String[] args) {

        System.out.println("🎮 Welcome to Tic Tac Toe!");

        // Player names
        System.out.print("Enter name for Player X: ");
        playerX = sc.nextLine();

        System.out.print("Enter name for Player O: ");
        playerO = sc.nextLine();

        System.out.println("\nInstructions:");
        System.out.println("- Board size is 3x3");
        System.out.println("- Enter row and column (0 to 2)");
        System.out.println("- " + playerX + " = X");
        System.out.println("- " + playerO + " = O");

        boolean playAgain;

        do {
            initializeBoard();
            playGame();
            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
            sc.nextLine(); // clear buffer
        } while (playAgain);

        System.out.println("Thanks for playing! 👋");
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void playGame() {
        char currentPlayer = 'X';
        boolean gameEnded = false;

        while (!gameEnded) {
            printBoard();
            playerMove(currentPlayer);

            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("🎉 " + getPlayerName(currentPlayer) + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("🤝 It's a draw!");
                gameEnded = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    static void playerMove(char player) {
        int row, col;

        while (true) {
            System.out.print(getPlayerName(player) + " (" + player + "), enter row and column: ");

            // Check row input
            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input. Enter numbers only.");
                sc.nextLine();
                continue;
            }
            row = sc.nextInt();

            // Check column input
            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid input. Enter numbers only.");
                sc.nextLine();
                continue;
            }
            col = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (isValidMove(row, col)) {
                board[row][col] = player;
                break;
            } else {
                System.out.println("❌ Invalid move. Cell occupied or out of bounds.");
            }
        }
    }

    static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ';
    }

    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    static void printHorizontalLine(int n) {
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    static void printBoard() {
        int n = board.length;

        System.out.println("\nCurrent Board:");
        System.out.print("    ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        printHorizontalLine(n);

        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < n; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            printHorizontalLine(n);
        }
    }

    static String getPlayerName(char player) {
        return (player == 'X') ? playerX : playerO;
    }
}