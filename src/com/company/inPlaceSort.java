package com.company;

public class inPlaceSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSwap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void selectSwap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int[] list1){
        for(int i = 1; i < list1.length; i++){
            int j = i;
            while(j-1 >= 0 && list1[j] < list1[j-1]){
                swap(list1, j, j-1);
                j--;
            }
        }
    }
    public static void selectionSort(double[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[i] < arr[j]){
                    selectSwap(arr, j, i);
                }
            }
        }
    }
    //use compareTo
    public static void bubbleSort(String[] list1){
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list1.length-1; j++) {
                if (list1[j].compareTo(list1[j+1])> 0) {
                    bubbleSwap(list1, j, j + 1);
                }
            }
        }
    }
}
