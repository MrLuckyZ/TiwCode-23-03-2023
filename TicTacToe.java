import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        
        // initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        
        // game loop
        while (true) {
            // print board
            printBoard(board);
            
            // get player move
            System.out.print("Player " + currentPlayer + ", enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            System.out.print("Player " + currentPlayer + ", enter column (1-3): ");
            int col = scanner.nextInt() - 1;
            
            // check if move is valid
            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            
            // update board and check for win/draw
            board[row][col] = currentPlayer;
            if (hasWon(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isDraw(board)) {
                System.out.println("Draw!");
                break;
            }
            
            // switch player turn
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        
        scanner.close();
    }
    
    // print board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    // check if a player has won
    public static boolean hasWon(char[][] board, char player) {
        // check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    
    // check if game is a draw
    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
