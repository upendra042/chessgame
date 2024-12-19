public class Cell {
    private int row;
    private int col;
    private Piece piece;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
