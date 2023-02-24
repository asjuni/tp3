public class Cell {

    private final Position position;
    private boolean isEmpty;
    private final Piece piece;

    public Cell(Position position, Piece piece) {
        this.position = position;
        this.piece = piece;
        this.isEmpty = false;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Piece getPiece() {
        return piece;
    }

}
/*
Non, nous n'avons pas besoin de créer six attributs. Au lieu de cela,
 nous pouvons créer un attribut appelé "piece" qui est de type Piece.
  Cet attribut peut être déclaré comme final et peut être utilisé pour stocker
  la pièce qui se trouve sur la cellule. Nous pouvons résoudre le problème en utilisant
   un objet Piece pour stocker la pièce.
 */
