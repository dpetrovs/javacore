package com.dpetrovs.app.runners.homework.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LoopsArraysRunner even = new LoopsArraysRunner();
        even.evenViewHoryzont(even.even0_20());
        even.evenViewVert(even.even0_20());

        LoopsArraysRunner odd = new LoopsArraysRunner();
        odd.evenViewHoryzont(odd.odd1_99());
        odd.evenViewHoryzont(odd.oddRevert1_99());

        LoopsArraysRunner mathRand0_15 = new LoopsArraysRunner();
        int[] a = mathRand0_15.arrRand0_15();
        mathRand0_15.evenViewHoryzont(a);
        mathRand0_15.counter(mathRand0_15.countRandElements(a));

        LoopsArraysRunner mathRand0_999 = new LoopsArraysRunner();
        int[] b = mathRand0_999.randMass0_999();
        mathRand0_999.evenViewHoryzont(b);
        mathRand0_999.counter(mathRand0_999.maxElementInMassive(b));
        mathRand0_999.counter(mathRand0_999.minElementInMassive(b));
    }

}
