package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class View {
    public void viewMassive(int[] array, String arrayState) {
        System.out.println("\n" + arrayState);
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ " + array[i] + " ]");
        }
    }
}
