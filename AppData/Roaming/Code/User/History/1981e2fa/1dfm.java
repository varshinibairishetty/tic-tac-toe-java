import java.util.Scanner;

/**
 * Tic Tac Toe Game
 * player takes turns entering their move (row and column).
 * the game continues until one player wins .
 * 
 * Instructions:
 * The game is played on a 3x3 grid by two players taking turns.
 * Player 1 uses 'X' and Player 2 uses 'O'.
 * The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game.
 * If all nine squares are filled and neither player has three in a row, the game is a draw.    
 * 
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name (X):");
        String player1 = sc.nextLine();
        System.out.println("Enter player 2 name (O):");
        String player2 = sc.nextLine();
        System.out.println("Game started between " + player1 + "and" + player2 + "\n");
//initialize the board
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';    //starting player
        boolean gameover = false;

        // Main game loop
        while (!gameover) {
            printboard(board);  //print the current board
            String currentplayer = (player == 'X') ? player1 : player2; //Get current player name
            System.out.println(currentplayer + "s turn to play ( " + player + ")");  //
            System.out.println("Enter row and col(0-4):");
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println();
            //check if the move is valid
            if (board[row][col] == ' ') { 
                board[row][col] = player;
                gameover = havewon(board, player); //check if the current player has won
                if (gameover) { 
                    System.out.println("player " + player + " has won:");
                } else {
                    if (player == 'X') {
                        player = 'O'; //Switch to player 2
                    } else {
                        player = 'X';//Switch to player 1
                    }
                }
            } else {
                System.out.println("Invalid move try again");
            }
        }
        printboard(board);
    }
//check if the player has won
    public static boolean havewon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            //check rows
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        //check columns
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
//check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        //check other diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;

        }
        return false;
    }
//print the board
    public static void printboard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "|");
            }

            System.out.println();
        }
    }
}
