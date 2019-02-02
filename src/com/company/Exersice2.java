package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exersice2 {
    public static void main(String[] args) {
        int[] a = {2, 4, 1, 3, 6, 7, 5};
        invert(a);
        showArray(a);

        sortArray(a);
        showArray(a);
          }

    private static void showArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    private static void invert(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
        sortArray(a);


    }

    private static void sortArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;


                }


            }

        }
    }

}




