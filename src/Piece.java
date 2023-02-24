public class Piece {
    public static final int KING = 0;
    public static final int QUEEN = 1;
    public static final int BISHOP = 2;
    public static final int KNIGHT = 3;
    public static final int ROOK = 4;
    public static final int PAWN = 5;

    private Position position;
    private int color;

    public Piece(Position position, int color){
        this.position = position;
        this.color = color;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean  isValidMove(Position newPosition) {
        return false;
    }

}
