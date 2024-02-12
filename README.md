# *Sudoku Generator*

Following rules must be followed for Sudoku to be valid:- 
- In all 9 sub-matrices 3×3, the elements should be 1-9, without repetition.
- All rows should have all elements between 1-9 at least once, without repetition.
- All columns should have all elements between 1-9 at least once, without repetition.

## Solution
We can improve the solution if we understand the pattern in this game. 
We can observe that all 3 x 3 matrices, which are diagonally present, are initially independent of other 3 x 3 adjacent matrices, as others are empty. 

Secondly, while we fill rest of the non-diagonal elements, we will not have to use random generator, but we can fill recursively by checking 1 to 9. 

Following is the logic for the problem.
1. Fill all the diagonal 3x3 matrices.
2. Fill recursively rest of the non-diagonal matrices.
   For every cell to be filled, we try all numbers until
   we find a safe number to be placed.  
3. Once matrix is fully filled, remove K elements
   randomly to complete game.

