package Services;

import java.util.Scanner;

public class CreateSudoku implements CreateSudokuService{

    @Override
    public int getInputLevel()
    {
        Scanner input = new Scanner(System.in);
        int level;
        while(true){
            System.out.println("Enter the level of Sudoku. Range(1-20)");
            level = input.nextInt();
            if(level>0 && level<21)
                break;
            else
                System.out.println("Invalid Value");
        }
        return level;
    }

    @Override
    public void createSudokuGrid(int grid[][])
    {
        int level = getInputLevel() + 30;
        for(int i=0; i<level; i++)
        {
            int row = (int) Math.floor((Math.random()*9));
            int column = (int) Math.floor((Math.random()*9));
            grid[row][column] = 0;
        }
    }

}
