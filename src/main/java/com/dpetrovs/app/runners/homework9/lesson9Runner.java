package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class lesson9Runner {
    public static void main(String[] args) {
        sorting sorting = new sorting();
        Strings strings = new Strings();
        View view = new View();
        ArraysCreation arrays = new ArraysCreation();
        MaxMinElements maxMin = new MaxMinElements();

        int[] uniDimentionalArray = arrays.uniDimentionalArray();
        int[][] twoDimentionalarray = arrays.twoDimentionalArray();

        /*Activities with uni-dimentional Array*/

        view.viewUnidimentionalArray(uniDimentionalArray, strings.getInitialState());

        int[] sortedBubbleDown = sorting.bubbleSortDown(uniDimentionalArray);
        view.viewUnidimentionalArray(sortedBubbleDown,strings.getOrderedBubbleDown());

        int[] sortedBubbleUp = sorting.bubbleSortUp(uniDimentionalArray);
        view.viewUnidimentionalArray(sortedBubbleUp,strings.getOrderedBubbleUp());

        int[] sortedMassiveJava = sorting.arrayToStringMethod(uniDimentionalArray);
        view.viewUnidimentionalArray(sortedMassiveJava, strings.getOrderedBubbleJava());

        int[] sortedSelectionSortUp = sorting.selectionSortUp(uniDimentionalArray);
        view.viewUnidimentionalArray(sortedSelectionSortUp,strings.getOrderedSelectionUp());

        int[] sortedSelectionSortDown = sorting.selectionSortDown(uniDimentionalArray);
        view.viewUnidimentionalArray(sortedSelectionSortDown,strings.getOrderedSelectionDown());

        /*End of ctivities with uni-dimentional Array*/

        /*Activities with two-dimentional Array*/

        view.viewTwodimentionalArray(twoDimentionalarray,strings.getTwoDimentionalinitialArray());
        int maxElement = maxMin.maxTwoDimElement(twoDimentionalarray);
        view.showNumber(maxElement,strings.getMaxArrayElement());

        /*End of activities with two-dimentional Array*/
    }
}
