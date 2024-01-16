public class Grid {
    int[] row1a;
    int[] row2a;
    int[] row3a;
    int[] row4a;
    int[] row5a;
    int[] row6a;
    int[] row7a;
    int[] row8a;
    int[] row9a;
    int[] row1b;
    int[] row2b;
    int[] row3b;
    int[] row4b;
    int[] row5b;
    int[] row6b;
    int[] row7b;
    int[] row8b;
    int[] row9b;
//    private int[][] solution = new int[9][9];
//    /* Initialize and edit grid
//    Make a method for creating rows, and editing them (both adding and subtracting characters
//    Make another method for putting together the rows in a string to be printed
//    Store the completed grid in either 9 int[] or 1 int[][] */
//
//    public void gridInitialize() {
//
//    }
//
//    //Helper method for adding an input to a co-ordinate
//    private int[] rowAdd(int input,int[] row,int column) {
//
//    }
//
//    //Helper method for tagging an input to a co-ordinate
//    private int[] rowTag(int input,int[] row,int column) {
//
//    }
//
    //Helper method for deleting an input from a co-ordinate
//    private int[] rowDel(int input,int[] row,int column) {
//
//    }
//
//    private int[][] gridDisplay() {
//
//    }

    //Helper method for ensuring numbers from 1-9 aren't reused when creating solution
    public static void oneToNine(int[] array, int num) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;
        int count = 0;
        for (int i : array) {
            if (i == 1 && num != 1) {
                one = true;
                count++;
            }
            if (i == 2 && num != 2) {
                two = true;
                count++;
            }
            if (i == 3 && num != 3) {
                three = true;
                count++;
            }
            if (i == 4 && num != 4) {
                four = true;
                count++;
            }
            if (i == 5 && num != 5) {
                five = true;
                count++;
            }
            if (i == 6 && num != 6) {
                six = true;
                count++;
            }
            if (i == 7 && num != 7) {
                seven = true;
                count++;
            }
            if (i == 8 && num != 8) {
                eight = true;
                count++;
            }
            if (i == 9 && num != 9) {
                nine = true;
                count++;
            }
        }
        int[] ret = new int[count];
        for (int i = 0; i < count; i++) {
            if (one) {
                one = false;
                ret[i] = 1;
            } else if (two) {
                two = false;
                ret[i] = 2;
            } else if (three) {
                three = false;
                ret[i] = 3;
            } else if (four) {
                four = false;
                ret[i] = 4;
            } else if (five) {
                five = false;
                ret[i] = 5;
            } else if (six) {
                six = false;
                ret[i] = 6;
            } else if (seven) {
                seven = false;
                ret[i] = 7;
            } else if (eight) {
                eight = false;
                ret[i] = 8;
            } else if (nine) {
                nine = false;
                ret[i] = 9;
            }
        }
        System.out.print("\nret: ");
        for (int j : ret) {
            System.out.print(j + ", ");
        }
        array = ret;
        System.out.print("\narray: ");
        for (int k : array) {
            System.out.print(k + ", ");
        }
    }
}
