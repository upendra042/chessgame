public class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        return (startRow == endRow || startCol == endCol) &&
                isPathClear(startRow, startCol, endRow, endCol, board);
    }
}