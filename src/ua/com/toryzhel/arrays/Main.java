package ua.com.toryzhel.arrays;

import java.util.Arrays;

/**
 * Finding the maximum and minimum value in each row of the array.
 * Create a two-dimensional 5x8 array of type int and initialize it with an initialization block.
 * Find the maximum and minimum value in each "line" and write these values into a 5x2 two-dimensional array.
 *
 * @author Semenchenko V.
 */
public class Main {
    public static void main(String[] args) {
        int [][] array = {
                {6,2,1,9,3,7,1,0},
                {8,2,7,2,7,9,5,5},
                {3,4,7,9,3,5,2,1},
                {7,1,5,3,0,6,2,8},
                {8,3,2,5,6,3,4,9}
        };
        System.out.println(Arrays.deepToString(array));

        int [][] arrayTwo = new int[5][2];
        for (int a = 0; a < 7; a++) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                       int temp = array[i][j + 1];
                       array[i][j + 1] = array[i][j];
                       array[i][j] = temp;
                    }
                }
            }
       }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++){
            arrayTwo [i][0] = array [i][0];
            arrayTwo [i][1] = array [i][7];
        }
        System.out.println(Arrays.deepToString(arrayTwo));

    }
}
