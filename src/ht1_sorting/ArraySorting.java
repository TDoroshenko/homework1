package ht1_sorting;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {33, 3, 6, 1, 55, 2, 3, 7, 567};
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
