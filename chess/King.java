public class King extends Piece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        return Math.max(Math.abs(startRow - endRow), Math.abs(startCol - endCol)) == 1;
    }
}
