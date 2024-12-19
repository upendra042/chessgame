public class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        return Math.abs(startRow - endRow) == Math.abs(startCol - endCol) &&
                isPathClear(startRow, startCol, endRow, endCol, board);
    }
}