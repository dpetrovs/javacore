package com.dpetrovs.app.runners.homework.lesson7;

import java.util.*;

public class LoopsArraysRunner {

    public int[] even0_20() {
        int[] evenMass = new int[10];
        int k = 0;
        for (int i = 2; i <= 20; i += 2) {
            evenMass[k] = i;
            k++;
        }
        return evenMass;
    }

    public int[] odd1_99() {

        int[] oddMass = new int[50];
        int k = 0;
        for (int i = 1; i < 100; i += 2) {
            oddMass[k] = i;
            k++;
        }
        return oddMass;
    }

    public int[] oddRevert1_99() {

        int[] oddMass = new int[50];
        int k = 0;
        for (int i = 99; i > 0; i -= 2) {
            oddMass[k] = i;
            k++;
        }
        return oddMass;
    }

    public int[] arrRand0_15() {

        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) Math.round(Math.random() * 15);
        }
        return mass;
    }

    public int countRandElements(int[] a) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] != 0) {
                counter++;
            }
        }
        return counter;
    }

    public int[] randMass0_999() {

        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) Math.round(Math.random() * 999);
        }
        return mass;
    }

    public int maxElementInMassive(int[] a) {
        int maxElement = 0;
        int maxValue;
        for (int i = 0; i < a.length; i++) {
            if (a[maxElement] < a[i]) {
                maxElement = i;
            }
        }
        maxValue = a[maxElement];
        return maxValue;
    }
    public int minElementInMassive(int[] a) {
        int minElement = 0;
        int minValue;
        for (int i = 0; i < a.length; i++) {
            if (a[minElement] > a[i]) {
                minElement = i;
            }
        }
        minValue = a[minElement];
        return minValue;
    }

    protected void evenViewHoryzont(int[] a) {
        String intArrayString = Arrays.toString(a);
        System.out.println(intArrayString);
    }

    protected void evenViewVert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    protected void counter(int a) {
        System.out.println("counter value is " + a);
    }

}
