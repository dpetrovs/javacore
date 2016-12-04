package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class Strings {
    private String initialState = "Изначально созданный массив:";
    private String orderedBubbleUp = "Массив, отсортированный методом пузырьковой сортировки вверх:";
    private String orderedBubbleDown = "Массив, отсортированный методом пузырьковой сортировки вниз:";
    private String orderedBubbleJava = "Массив, отсортированный внутренним методом Arrays.toString:";
    private String orderedSelectionUp = "Массив, отсортированный Selection Sort вверх:";
    private String orderedSelectionDown = "Массив, отсортированный Selection Sort вниз:";

    public String getInitialState() {
        return initialState;
    }

    public String getOrderedBubbleUp() {
        return orderedBubbleUp;
    }

    public String getOrderedBubbleDown() {
        return orderedBubbleDown;
    }

    public String getOrderedBubbleJava() {
        return orderedBubbleJava;
    }

    public String getOrderedSelectionUp() {
        return orderedSelectionUp;
    }

    public String getOrderedSelectionDown() {
        return orderedSelectionDown;
    }
}
