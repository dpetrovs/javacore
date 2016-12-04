package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class View {
    public void viewUnidimentionalArray(int[] array, String arrayState) {
        System.out.println("\n\n" + arrayState);
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
    }

    public void viewTwodimentionalArray(int[][] array, String arrayState) {
        System.out.println("\n\n" + arrayState);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public void showNumber(int number, String string) {
        System.out.println("\n\n" + string + " " + number);
    }
}
