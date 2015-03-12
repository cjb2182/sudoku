
public class SudokuTile implements GameTile{

    /*
     * Final --> EMPTY does not change
     * static --> same for all instances of the class
     */
    public static final int EMPTY = 0;
    public static final int FULL = 1;
    public static final int PERMANENT = 2;

    /**
     * attributes of SudokuTile
     */
    int row;
    int col;
    int box;
    int state;
    int value;

    /*
     * constructor - initialize attributes
     */
    public SudokuTile(int row, int col){
        this.state = EMPTY; 
        this.value - EMPTY;
        this.row = row;
        this.col = col;
        this.box = getBoxFromRowCol(this.row, this.col)
    }

    public SudokuTile(int row, int col, int state, int value){
        this.state = state;
        this.value = value;
        this.row = row;
        this.col = col;
        this.box = getBoxFromCol(this.row, this.col);
    }

    public int getBoxFromRowCol(int row, int col){

    }

    /*
     * permanent, full, empty
     */
    public void setState(int state){
        if(this.state == (FULL || EMPTY) && state == (FULL || EMPTY){
            this.state = state;
        }
    }
    /*
     * 1-9, 0 for empty
     */
    public void setValue(int value){
        this.value = value;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public int getBox(){
        return this.box;
    }

}
