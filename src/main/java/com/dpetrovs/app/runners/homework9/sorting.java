package com.dpetrovs.app.runners.homework9;

import java.util.*;

public class sorting {

    public int[] massiveCreation() {
        int[] arrayForSort = new int[10];
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) Math.round(Math.random() * 10);
        }
        return arrayForSort;
    }

    public int[] bubbleSortDown(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tempArray = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempArray;
                }
            }
        }
        return array;
    }

    public int[] bubbleSortUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempArray = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempArray;
                }
            }
        }
        return array;
    }

    public int[] arrayToStringMethod(int[] array) {
        Arrays.toString(array);
        return array;
    }

    public int[] selectionSortUp(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    smallestIndex = j;
                }
            }
                int theSmallestElement = array[smallestIndex];
                array[smallestIndex] = array[i];
                array[i] = theSmallestElement;
        }
        return array;
    }

    public int[] selectionSortDown(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    smallestIndex = j;
                }
            }
            int theSmallestElement = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = theSmallestElement;
        }
        return array;
    }

}

