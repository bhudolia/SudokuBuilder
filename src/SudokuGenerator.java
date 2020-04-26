import Services.*;


public class SudokuGenerator {
    private int grid[][];

    private SudokuGenerator(ValidateSudokuService validateSudokuService)
    {
        //Initialize the Sudoku
        grid = new int[9][9];


        //Putting random values in the Diagonal Boxes
        for(int j=0; j<3; j++) {
            for (int k = 0; k < 3; k++) {
                while(true) {
                    int i = (int) Math.floor((Math.random()*9+1));
                    if (validateSudokuService.checkBox(grid, i, j, k)) {
                            grid[j][k] = i;
                            break;
                    }
                }
            }
        }
        for(int j=3; j<6; j++) {
            for (int k = 3; k < 6; k++) {
                while(true) {
                    int i = (int) Math.floor((Math.random()*9+1));
                    if (validateSudokuService.checkBox(grid, i, j, k)) {
                            grid[j][k] = i;
                            break;
                    }
                }
            }
        }
        for(int j=6; j<9; j++) {
            for (int k = 6; k < 9; k++) {
                while(true) {
                    int i = (int) Math.floor((Math.random()*9+1));
                    if (validateSudokuService.checkBox(grid, i, j, k)) {
                            grid[j][k] = i;
                            break;
                    }
                }
            }
        }

    }
    private void printSudoku(int grid[][])
    {
        for(int i=0; i<9; i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(grid[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ValidateSudokuService validateSudokuService = new ValidateSudoku();
        SolveSudokuService solveSudokuService = new SolveSudoku();
        CreateSudokuService createSudokuService = new CreateSudoku();

        //For Generating a Sudoku Problem
        SudokuGenerator sudokuGenerator = new SudokuGenerator(validateSudokuService);
        solveSudokuService.createSolution(validateSudokuService, 0, 0, sudokuGenerator.grid);
        createSudokuService.createSudokuGrid(sudokuGenerator.grid);
        sudokuGenerator.printSudoku(sudokuGenerator.grid);

        //For Generating only Solution; Uncomment and enter the Grid.
        /*int grid[][] = new int[][]{
                {5, 0, 0, 7, 8, 2, 6, 0, 0},
                {7, 8, 0, 9, 5, 6, 2, 0, 3},
                {6, 0, 0, 0, 1, 0, 7, 8, 5},
                {3, 0, 0, 8, 0, 7, 5, 6, 1},
                {1, 7, 6, 2, 0, 5, 4, 0, 8},
                {8, 5, 0, 0, 6, 1, 0, 2, 7},
                {0, 1, 5, 6, 7, 0, 8, 0, 2},
                {0, 0, 7, 1, 0, 8, 0, 5, 6},
                {0, 6, 8, 5, 0, 0, 1, 7, 4}
        };
        solveSudokuService.createSolution(validateSudokuService, 0, 0, grid);
        sudokuGenerator.printSudoku(grid);
        */

    }
}
