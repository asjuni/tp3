public class Knight extends Piece {
    public Knight(Position position, int color) {
        super(position, color);
    }

    @Override
    public boolean isValidMove(Position newPosition , Cell[][] board) {
        int x = Math.abs(newPosition.getX() - this.position.getX());
        int y = Math.abs(newPosition.getY() - this.position.getY());
        return (x == 0 && y == 1) || (x == 1 && y == 1);
    }
}