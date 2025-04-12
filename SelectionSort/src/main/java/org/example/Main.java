package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SelectionSort sort = new SelectionSort();
        int[] dizi = { 9 , 6 , 4 , 10 , 5};

        int[] sıralıDızı = sort.selectionSort(dizi );

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}