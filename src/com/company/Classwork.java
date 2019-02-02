package com.company;

import java.util.Arrays;

public class Classwork {
    public static void main(String[] args) {
        int a[] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }

    }

        }


