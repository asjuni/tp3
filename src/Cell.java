public class Cell {
    private Position position;
    private boolean isEmpty;
    private Piece piece;

    public Cell(Position position, boolean isEmpty , Piece piece) {
        this.position = position;
        this.isEmpty = isEmpty;
        this.piece = piece;
    }

    public final Position getPosition() {
        return position;
    }    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean getisEmpty() {
        return this.value == null;
    }

    public void setisEmpty(int Empty) {
        this.Empty = Empty;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
