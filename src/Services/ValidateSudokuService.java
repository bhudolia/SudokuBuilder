package Services;

public interface ValidateSudokuService {
    public boolean checkBox(int grid[][], int value, int row, int column);
    public boolean checkColumn(int grid[][], int value, int column);
    public boolean checkRow(int grid[][], int value, int row);
}
