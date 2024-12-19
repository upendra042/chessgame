public class knight extends Piece {
    public knight(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        return (Math.abs(startRow - endRow) == 2 && Math.abs(startCol - endCol) == 1) ||
               (Math.abs(startRow - endRow) == 1 && Math.abs(startCol - endCol) == 2);
    }
}
