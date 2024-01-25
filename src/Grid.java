import java.util.Random;
public class Grid {
    private String[][] solution;
    private String[][] display;

//    /* Initialize and edit grid
//    Make a method for creating rows, and editing them (both adding and subtracting characters
//    Make another method for putting together the rows in a string to be printed
//    Store the completed grid in either 9 int[] or 1 int[][] or smt like taht idk*/

    public Grid() {
        solution = new String[9][9];
        initializeSolvedSudoku();
        printSudokuGrid(solution);
    }

    public void initializeSolvedSudoku() {
        int[][] intGrid = generateCompletedSudoku();

        if (intGrid != null) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    solution[i][j] = Integer.toString(intGrid[i][j]);
                }
            }
        }
    }

    private boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValidMove(grid, row, col, num)) {
                            grid[row][col] = num;
                            if (solveSudoku(grid)) {
                                return true;
                            }
                            grid[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValidMove(int[][] grid, int row, int column, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num || grid[i][column] == num) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = column - column % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private int[][] generateCompletedSudoku() {
        int[][] grid = new int[9][9];

        if (solveSudoku(grid)) {
            return grid;
        }

        return null;
    }

    private void printSudokuGrid(String[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    private void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

}
