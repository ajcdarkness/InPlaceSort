package com.company;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] intList = {3 ,6 ,9, 1,2, 7, 8, 11, 23};
        double[] doubleList = {3.24, 6.57, 1.234, 9.453467, 4.23426, 3.12356346, 10.12304234};
        String[] stringList = {"nueces", "okay","nein","lul","gottem", "this is great"};
        int[] mergeSortTest = {9,1,6,2,8};

        inPlaceSort.insertionSort(intList);
        inPlaceSort.selectionSort(doubleList);
        inPlaceSort.bubbleSort(stringList);

        System.out.println("Insertion Sort Outs:");
        for(int i = 0; i < intList.length; i++){
            System.out.println(intList[i]);
        }
        System.out.println("Selection Sort Outs:");
        for(int j = 0; j < doubleList.length; j++){
            System.out.println(doubleList[j]);
        }
        System.out.println("Bubble Sort Outs:");
        for(int m = 0; m < stringList.length; m++){
            System.out.println(stringList[m]);
        }
        System.out.println("Merge Sort Outs: ");
        inPlaceSort.mergeSort(mergeSortTest);
        System.out.println(Arrays.toString(mergeSortTest));
    }
}
