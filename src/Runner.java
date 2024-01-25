import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] test = new int[9];

//        test[0] = 1;
//        test[1] = 2;
//        test[2] = 3;
//        test[3] = 4;
//        test[4] = 5;
//        test[5] = 6;
//        test[6] = 7;
//        test[7] = 8;
//        test[8] = 9;
//
//
//        Grid.oneToNine(test, 2);
//        System.out.println("Array: ");
////        System.out.println(test2[9]);
//        for (int i = 0; i < test.length; i++) {
//            System.out.print(test[i] + ", ");
//        }
        Grid grid = new Grid();
        grid.initializeSolvedSudoku();
    }
}
/* How will it work?
        - Runner class will have a starter method which will be called in Grid class
            > Starter method in grid class will call gridInitialize, which will
              initialize multiple single dimensional integer arrays which will be
              instance variables. They will be grouped together to create a 2D
              integer grid which will be the solution instance variable. It will then
              call a helper method which will randomly edit the solved grid, setting
              some of the values to 0. (Maybe tweak this to make an extra class that will
              turn the integer array into a String array and set the values to null so
              they can return nothing instead of a 0.
        - Grid class will have a total of 10 instance variables. 9 for each of the rows
          and 1 for the grid solution.
        - Grid class will have a gridDisplay method which will take all 9 rows of
          integer arrays and turn them into a grid using a nested(?) for loop before
          returning the 2D grid.
        - Based on the player's input, the program will run a method in the Actions class
          which will break down the input to understand what the player is trying to do
          before calling either the rowDel, rowAdd, or rowTag method (player must say one
          of the aforementioned methods). Each of these methods will have 3 parameters which
          will be in the player input and initialized in the Actions class.
            > Brainstorming for rowDel, rowAdd, and rowTag
                * Make it return a 1D int array
                    - Pros: Easy to implement
                    - Cons: Will return "0" on empty values
                * Make it return a 1D String array
                    - Pros: Will return null
                    - Cons: Will be time-consuming to scrap everything done so far
                * Make it return a 2D int array
                    - Pros: Will likely be the most efficient
                    - Cons: Will likely be the most prone to mistakes
           > Additional needs:
                * Must make rowDel incapable of deleting something that is provided by the
                  program and not by the player's inputs.
                    -
                * How to implement rowTag
                    -
        - Once the player is finished, they can call a method with a specific input. Once
          this input is called, the program will run a method in the Grid class which will
          check if the player's final grid is the same as the original solution.
 */