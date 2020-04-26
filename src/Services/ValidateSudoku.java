package Services;

public class ValidateSudoku implements ValidateSudokuService{
    @Override
    public boolean checkBox(int grid[][], int value, int row, int column)
    {
        if(row<3 && column<3){
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<3 && column<6){
            for(int i=0; i<3; i++){
                for(int j=3; j<6; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<3 && column<9){
            for(int i=0; i<3; i++){
                for(int j=6; j<9; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<6 && column<3){
            for(int i=3; i<6; i++){
                for(int j=0; j<3; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<6 && column<6){
            for(int i=3; i<6; i++){
                for(int j=3; j<6; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<6 && column<9){
            for(int i=3; i<6; i++){
                for(int j=6; j<9; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<9 && column<3){
            for(int i=6; i<9; i++){
                for(int j=0; j<3; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else if(row<9 && column<6){
            for(int i=6; i<9; i++){
                for(int j=3; j<6; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        else{
            for(int i=6; i<9; i++){
                for(int j=6; j<9; j++){
                    if(grid[i][j] == value)
                        return false;
                }
            }
        }
        return true;
    }
    @Override
    public boolean checkColumn(int grid[][], int value, int column)
    {
        for(int i=0; i<9; i++){
            if(grid[i][column] == value)
                return false;
        }
        return true;
    }
    @Override
    public boolean checkRow(int grid[][], int value, int row)
    {
        for(int i=0; i<9; i++){
            if(grid[row][i] == value)
                return false;
        }
        return true;
    }
}
