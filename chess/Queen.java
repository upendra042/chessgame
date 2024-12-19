public class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        return (startRow == endRow || startCol == endCol || Math.abs(startRow - endRow) == Math.abs(startCol - endCol)) &&
                isPathClear(startRow, startCol, endRow, endCol, board);
    }
}
