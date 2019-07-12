package ht1_array;

import java.util.Random;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] initArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] finalArray = new int[15];

        for (int i = 0; i < 15; i++) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(initArray.length);
            finalArray[i] = initArray[randomIndex];
        }
        System.out.println(Arrays.toString(finalArray));

        int even = 0;
                for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] % 2 == 0) {
                ++even;
            }
        }
        System.out.println("Even ht1_array elements amount is "+ even);
    }
}

