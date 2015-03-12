public class SudokuBoard implements GameBoard{
    SudokuTile [][] board;
    int numRows;
    int numCols;

    public SudokuBoard(){
        numRows = 9;
        numCols = 9;
        board = new SudokuTile[this.numRows][this.numCols]; 
    } 

    /**
     * checks if board is full.  If so, checks if board is correct
     */
    public boolean isDone(){

        if (allTilesFilled() && allRowsCorrect() && allColsCorrect() && allBoxCorrect()){
            return true;
        }
        return false;
    }

    public boolean allTilesFilled(){
    
    }

    public boolean allRowsCorrect(){

    }

    public boolean allColsCorrect(){

    }

    public boolean allBoxCorrect(){
    
    }

    public int [] getMove(){

    }

    public void setMove(){

    }

    public int getNumRows(){
        return this.numRows;
    }

    public void setNumRows(int numRows){
        this.numRows = numRows;
    }

    public int getNumCols(){
        return this.numCols;
    }
    public void setNumCols(int numCols){
        this.numCols = numCols;
    }

}
