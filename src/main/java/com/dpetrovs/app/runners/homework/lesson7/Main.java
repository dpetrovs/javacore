package com.dpetrovs.app.runners.homework.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LoopsArraysRunner massiveLesson = new LoopsArraysRunner();
        massiveLesson.evenViewHoryzont(massiveLesson.even0_20());
        massiveLesson.evenViewVert(massiveLesson.even0_20());

        massiveLesson.evenViewHoryzont(massiveLesson.odd1_99());
        massiveLesson.evenViewHoryzont(massiveLesson.oddRevert1_99());

        int[] a = massiveLesson.arrRand0_15();
        massiveLesson.evenViewHoryzont(a);
        massiveLesson.counter(massiveLesson.countRandElements(a));

        int[] b = massiveLesson.randMass0_999();
        massiveLesson.evenViewHoryzont(b);
        massiveLesson.counter(massiveLesson.maxElementInMassive(b));
        massiveLesson.counter(massiveLesson.minElementInMassive(b));
    }

}