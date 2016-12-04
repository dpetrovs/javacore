package com.dpetrovs.app.runners.homework9;

/**
 * Created by Dmitrik on 04.12.2016.
 */
public class MaxMinElements {

    public int maxTwoDimElement(int[][] array){
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length -1; j++){
                if(array[i][j] > maxElement){
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }
}
