package ua.Alexander.Romanov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hi");
        int[] arrayToSort = {2, 6, 3, -5, 7, 11, 4};
        for (int i = 0; i < arrayToSort.length; i++) {

            for (int y = arrayToSort.length - 1; y > i; y--) {
                if (arrayToSort[y - 1] > arrayToSort[y]) {
                    int temp = arrayToSort[y - 1];
                    arrayToSort[y - 1] = arrayToSort[y];
                    arrayToSort[y] = temp;

                }
            }
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + ", ");
        }

    }
}




