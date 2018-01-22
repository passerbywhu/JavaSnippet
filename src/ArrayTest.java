//螺旋数组

/**
 *  1 2 3
 *  8 9 4
 * 7 6 5
 *
 * 1  2  3  4
 * 12 13 14 5
 * 11 16 15 6
 * 10 9 8  7
 */

public class ArrayTest {
    static int[][] array;
    static int size = 5;
    static int RIGHT = 0;
    static int DOWN = 1;
    static int LEFT = 2;
    static int UP = 3;
    static int direction;

    public static void construct() {
        array = new int[size][size];
        int total = (int) Math.pow(size, 2);
        int row = 0, col = 0;
        array[row][col] = 1;
        direction = RIGHT;
        for (int i = 2; i <= total; i ++) {
            int row_l = 0;
            int col_l = 0;
            if (direction == RIGHT) {
                row_l = row;
                col_l = col + 1;
                if (col_l >= size || array[row_l][col_l] != 0) { //换方向
                    direction = DOWN;
                    row_l = row + 1;
                    col_l = col;
                }
            } else if (direction == DOWN) {
                row_l = row + 1;
                col_l = col;
                if (row_l >= size || array[row_l][col_l] != 0) {
                    direction = LEFT;
                    row_l = row;
                    col_l = col - 1;
                }
            } else if (direction == LEFT) {
                row_l = row;
                col_l = col - 1;
                if (col_l < 0 || array[row_l][col_l] != 0) {
                    direction = UP;
                    row_l = row - 1;
                    col_l = col;
                }
            } else if (direction == UP) {
                row_l = row - 1;
                col_l = col;
                if (row_l < 0 || array[row_l][col_l] != 0) {
                    direction = RIGHT;
                    row_l = row;
                    col_l = col + 1;
                }
            }
            array[row_l][col_l] = i;
            row = row_l;
            col = col_l;
            continue;
        }
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        construct();
    }
}
