import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name (X):");
        String player1 = sc.nextLine();
        System.out.println("Enter player 2 name (O):");
        String player2 = sc.nextLine();
        System.out.println("Game started between " + player1 + "and" + player2 + "\n");

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameover = false;
        while (!gameover) {
            printboard(board);
            String currentplayer = (player == 'X') ? player1 : player2;
            System.out.println(currentplayer + "s turn to play ( " + player + ")");
            System.out.println("Enter row and col(0-4):");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();
            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameover = havewon(board, player);
                if (gameover) {
                    System.out.println("player " + player + " has won:");
                } else {
                    if (player == 'X') {
                        player = 'O';
                    } else {
                        player = 'X';
                    }
                }
            } else {
                System.out.println("Invalid move try again");
            }
        }
        printboard(board);
    }

    public static boolean havewon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;

        }
        return false;
    }

    public static void printboard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "|");
            }

            System.out.println();
        }
    }
}
