package com.dpetrovs.app.runners.homework.lesson7;
import java.util.*;

public class LoopsArraysRunner {

    public int[] even(){
        int[] evenMass = new int [10];
        int k = 0;
        for (int i=2;i<=20;i+=2){
            evenMass[k] = i;
            k++;
        }
        return evenMass;
    }

    protected void evenViewHoryzont(int[] a){
        String intArrayString = Arrays.toString(a);
            System.out.println(intArrayString);
    }

    protected void evenViewVert(int[] a){
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
