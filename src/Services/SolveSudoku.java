package Services;

public class SolveSudoku implements SolveSudokuService{

    @Override
    public boolean createSolution(ValidateSudokuService validateSudokuService, int row, int column, int grid[][])
    {
        if (column>=9 && row<9)
        {
            row = row + 1;
            column = 0;
        }
        if (row>=9 && column==0)
            return true;

        if(grid[row][column]!= 0)
        {
            if (createSolution(validateSudokuService, row, column+1, grid))
                return true;
            else
                return false;
        }

        for (int num = 1; num<=9; num++)
        {
            if (CheckIfSafe(validateSudokuService, row, column, num, grid))
            {
                grid[row][column] = num;
                if (createSolution(validateSudokuService, row, column+1, grid))
                    return true;

                grid[row][column] = 0;
            }
        }
        return false;
    }

    @Override
    public boolean CheckIfSafe(ValidateSudokuService validateSudokuService, int row, int column, int value, int grid[][])
    {
        if (validateSudokuService.checkBox(grid, value, row, column)) {
            if ((validateSudokuService.checkColumn(grid, value, column)) && (validateSudokuService.checkRow(grid, value, row))) {
                return true;
            }
        }
        return false;
    }
}
