package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class ArraysCreation {
    public int[] uniDimentionalArray() {
        int[] arrayForSort = new int[10];
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 10);
        }
        return arrayForSort;
    }
    public int[][] twoDimentionalArray() {
        int[][] twoDimentionalArray = new int[5][8];
        for (int i = 0; i < twoDimentionalArray.length; i++) {
            for (int j = 0; j < twoDimentionalArray[i].length - 1; j++){
                twoDimentionalArray[i][j] = ((int) Math.round(Math.random() * 200) -99);
            }
        }
        return twoDimentionalArray;
    }
}
