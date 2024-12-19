public class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        int direction = color.equals("white") ? -1 : 1;
        if (startCol == endCol) { // Forward move
            if (endRow - startRow == direction && board.getPiece(endRow, endCol) == null) {
                return true;
            }
            if (endRow - startRow == 2 * direction &&
                ((startRow == 6 && color.equals("white")) || (startRow == 1 && color.equals("black"))) &&
                board.getPiece(endRow, endCol) == null &&
                board.getPiece(startRow + direction, startCol) == null) {
                return true;
            }
        } else if (Math.abs(startCol - endCol) == 1 && endRow - startRow == direction) { // Capture
            return board.getPiece(endRow, endCol) != null &&
                   !board.getPiece(endRow, endCol).getColor().equals(color);
        }
        return false;
    }
}
