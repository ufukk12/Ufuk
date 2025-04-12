package org.example;

public class SelectionSort {

    public int[] selectionSort(int[] arr ) {

        if (arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length ; i++) {

            int enKucukIndex = i;


            for (int j = i+1; j < arr.length; j++) {
                if (arr[enKucukIndex] > arr[j]) {
                    int temp = arr[i];
                    arr[enKucukIndex] = arr[j];
                    arr[j] = temp;

                }else {
                    enKucukIndex = j;

                }
            }
        }

        return arr;
    }
}
