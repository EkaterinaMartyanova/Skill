package ru.geekbrains.java_one.lesson_a.online;

import java.util.Arrays;

public class Home2 {

    private static int[] ChangeNumbers(int [] a) {
        for (int i = 0; i < a.length; i++) {
         switch (a[i]) {
             case 0:
                 a[i] = 1;
                 break;
             case 1:
                 a[i]=0;
         }
        }
        return a;
    }

    private static int[] PushNumbers(int [] a) {
        for (int i = 1; i < a.length; i++) {
            a[0] = 1;
            a[i] = a[i-1] + 3;
        }
        return a;
    }

    private static int[] ChangeArrays(int [] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] < 6) ? a[i]*2:a[i];
        }
        return a;
    }

    private static int [] ExtremNumb(int [] a) {
        int minimum = a[0];
        int maximum = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maximum < a[i]) {
                maximum = a[i];
            }
            if (minimum > a[i]) {
                minimum = a[i];
            }
        }
        int [] b = new int[2];
        b[0]=minimum;
        b[1]=maximum;
        return b;
    }

    private static int [][] Diagonally(int [][] a) {
        for (int i = 0; i < a.length; i++) {
                for (int j = 0, l = a[i].length - 1; j < a[i].length; j++, l--) {
                    if (i == j || i == l) a[i][j] = 1;
                    else a[i][j] = a[i][j];
                    System.out.print(a[i][j] + " ");

                }
                System.out.print("\n");
            }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(ChangeNumbers(arr)));

        int[] arr1 = new int[8];
        System.out.println(Arrays.toString(PushNumbers(arr1)));

        int [] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ChangeArrays(arr2)));

        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(ExtremNumb(arr3)));

        int[][] arr4 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 21}
        };
        int[][] arr5 = Diagonally(arr4);
        }
    }


