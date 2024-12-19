public abstract class Piece {
    protected final String color;

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isValidMove(int startRow, int startCol, int endRow, int endCol, ChessBoard board);

    protected boolean isPathClear(int startRow, int startCol, int endRow, int endCol, ChessBoard board) {
        if (startRow == endRow) { // Horizontal
            int step = (startCol < endCol) ? 1 : -1;
            for (int col = startCol + step; col != endCol; col += step) {
                if (board.getPiece(startRow, col) != null) return false;
            }
        } else if (startCol == endCol) { // Vertical
            int step = (startRow < endRow) ? 1 : -1;
            for (int row = startRow + step; row != endRow; row += step) {
                if (board.getPiece(row, startCol) != null) return false;
            }
        } else if (Math.abs(startRow - endRow) == Math.abs(startCol - endCol)) { // Diagonal
            int stepRow = (startRow < endRow) ? 1 : -1;
            int stepCol = (startCol < endCol) ? 1 : -1;
            for (int row = startRow + stepRow, col = startCol + stepCol; row != endRow; row += stepRow, col += stepCol) {
                if (board.getPiece(row, col) != null) return false;
            }
        }
        return true;
    }
}
