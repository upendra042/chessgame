import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        Scanner scanner = new Scanner(System.in);

        Player whitePlayer = new Player("Alice", "white");
        Player blackPlayer = new Player("Bob", "black");

        board.initializeBoard();

        boolean gameOn = true;
        Player currentPlayer = whitePlayer;

        while (gameOn) {
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getColor() + ").");
            System.out.println("Enter your move in the format 'startRow startCol endRow endCol':");

            try {
                int startRow = scanner.nextInt();
                int startCol = scanner.nextInt();
                int endRow = scanner.nextInt();
                int endCol = scanner.nextInt();

                if (!board.isWithinBounds(startRow, startCol, endRow, endCol)) {
                    System.out.println("Move is out of bounds! Try again.");
                    continue;
                }

                Piece piece = board.getPiece(startRow, startCol);
                if (piece == null || !piece.getColor().equals(currentPlayer.getColor())) {
                    System.out.println("Invalid piece selection. You must move your own piece. Try again.");
                    continue;
                }

                if (board.movePiece(startRow, startCol, endRow, endCol)) {
                    System.out.println("Move successful!");

                    // Check for checkmate
                    if (board.isCheckmate(currentPlayer.getColor().equals("white") ? "black" : "white")) {
                        System.out.println("Checkmate! " + currentPlayer.getName() + " wins!");
                        gameOn = false;
                    } else {
                        // Switch players
                        currentPlayer = currentPlayer == whitePlayer ? blackPlayer : whitePlayer;
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input format. Please enter your move in the correct format.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
