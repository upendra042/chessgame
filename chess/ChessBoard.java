public class ChessBoard {
    private final Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
    }

    public boolean isWithinBounds(int startRow, int startCol, int endRow, int endCol) {
        return startRow >= 0 && startRow < 8 && startCol >= 0 && startCol < 8 &&
               endRow >= 0 && endRow < 8 && endCol >= 0 && endCol < 8;
    }
    
    public boolean isCheckmate(String opponentColor) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece instanceof King && piece.getColor().equals(opponentColor)) {
                    return false; // King is still present
                }
            }
        }
        return true; // King is not found
    }
    
    public void initializeBoard() {
        // Initialize Pawns
        for (int col = 0; col < 8; col++) {
            placePiece(new Pawn("white"), 6, col);
            placePiece(new Pawn("black"), 1, col);
        }
    
        // Initialize Rooks
        placePiece(new Rook("white"), 7, 0);
        placePiece(new Rook("white"), 7, 7);
        placePiece(new Rook("black"), 0, 0);
        placePiece(new Rook("black"), 0, 7);
    
        // Initialize Knights
        placePiece(new knight("white"), 7, 1);
        placePiece(new knight("white"), 7, 6);
        placePiece(new knight("black"), 0, 1);
        placePiece(new knight("black"), 0, 6);
    
        // Initialize Bishops
        placePiece(new Bishop("white"), 7, 2);
        placePiece(new Bishop("white"), 7, 5);
        placePiece(new Bishop("black"), 0, 2);
        placePiece(new Bishop("black"), 0, 5);
    
        // Initialize Queens
        placePiece(new Queen("white"), 7, 3);
        placePiece(new Queen("black"), 0, 3);
    
        // Initialize Kings
        placePiece(new King("white"), 7, 4);
        placePiece(new King("black"), 0, 4);
    }
    
    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public boolean movePiece(int startRow, int startCol, int endRow, int endCol) {
        Piece piece = getPiece(startRow, startCol);
        if (piece != null && piece.isValidMove(startRow, startCol, endRow, endCol, this)) {
            board[endRow][endCol] = piece;
            board[startRow][startCol] = null;
            return true;
        }
        return false;
    }

    // New method to place a piece at a specific position
    public void placePiece(Piece piece, int row, int col) {
        board[row][col] = piece;
    }
}
