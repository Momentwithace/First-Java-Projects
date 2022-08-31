package Chapter7.TurtleGraphics;

import java.util.Objects;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;

    }

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

    @Override
    public boolean equals(Object input){
        Position compared = (Position) input;
        if(row == compared.getRow() && column == compared.getColumn()) return true;
        return false;
    }

    @Override
    public String toString(){
        return String.format("Row : %d Column: %d", row, column);
    }


    public void setColumn(int column) {
        this.column = column;
    }
}
