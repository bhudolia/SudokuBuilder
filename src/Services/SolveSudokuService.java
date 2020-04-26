package Services;

public interface SolveSudokuService {
    public boolean createSolution(ValidateSudokuService validateSudokuService, int row, int column, int grid[][]);
    public boolean CheckIfSafe(ValidateSudokuService validateSudokuService, int row, int column, int value, int grid[][]);
}
