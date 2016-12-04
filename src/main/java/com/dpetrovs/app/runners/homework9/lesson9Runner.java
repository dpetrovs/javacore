package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class lesson9Runner {
    public static void main(String[] args) {
        sorting sorting = new sorting();
        Strings strings = new Strings();
        View view = new View();
        int[] initialMassive = sorting.massiveCreation();

        view.viewMassive(initialMassive, strings.getInitialState());

        int[] sortedBubbleDown = sorting.bubbleSortDown(initialMassive);
        view.viewMassive(sortedBubbleDown,strings.getOrderedBubbleDown());

        int[] sortedBubbleUp = sorting.bubbleSortUp(initialMassive);
        view.viewMassive(sortedBubbleUp,strings.getOrderedBubbleUp());

        int[] sortedMassiveJava = sorting.arrayToStringMethod(initialMassive);
        view.viewMassive(sortedMassiveJava, strings.getOrderedBubbleJava());

        int[] sortedSelectionSortUp = sorting.selectionSortUp(initialMassive);
        view.viewMassive(sortedSelectionSortUp,strings.getOrderedSelectionUp());

        int[] sortedSelectionSortDown = sorting.selectionSortDown(initialMassive);
        view.viewMassive(sortedSelectionSortDown,strings.getOrderedSelectionDown());
    }
}
