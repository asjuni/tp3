public class Position {
    private char column ;
    private int row ;
    public Position(char column, int row){
        this.column = column;
        this.row = row;
    }
    public char getcolumn() {
        return column;
    }

    public int getrow() {
        return row;
    }
    public void setColumn(char column) {
        this.column = column;
    }

    public void setrow(int row) {
        this.row = row;
    }
   String x ;
    String y ;
    public String toString(){
        return "("+x+","+y+")";
    }
}
