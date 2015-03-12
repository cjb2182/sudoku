indexes of values_seen 0 1 2 3 4 5 6 7 8 
corresponding values 1 2 3 4 5 6 7 8 9

(this.state ===FULL) || this.state === EMPTY


01 9
String strRowCol = strMove[0]; //"01"
String strRow = strRowCol.substring(0,1) //"0"
String strCol = strRowCol.substring(1,2)//"1"

strMove[1] = "9"


String [] strRowColMove = new String[3];
strRowColMove[0] = 





int [] values_seen = new int[numcol]; // col bc going across rows ARRAY OF ZEROS
refactoring

2 2 4 
for (int j = 0; j<colnum; j++){
    SudokuTile t = board[0][j];
    int val = t.value;

    if (values_seen[val-1] == 0){
        values_seen[val-1] = val;
    }
    else{
        System.out.println("DUPLICATES FOUND IN ROW");
    }
    
}


1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9


int valuesSeen [][] = new int[numboxes][numberofvaluesicansee];

for(i){
    for(j){
        SudokuTile t = board[i][j];
        int val = t.value;
        int box = t.box;

        if(valuesSeen[box-1][val-1] == 0){
            valuesSeen[box-1][val-1] = val;
        }
    }
}




