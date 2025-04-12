package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SorthingAlgorithms sort = new SorthingAlgorithms();
        int uzunluk;
        System.out.println("Lütfen sıralanacak dizi uzunluğunu seçin");
        uzunluk = sc.nextInt();
        int[] dizi = sort.diziUret(uzunluk);
        //----------------------------------------------------------------------------------

        int[] BubbleSort = sort.bubbleSort(dizi , 0);
        System.out.println("1 - Bubble Sort");
        sort.diziYazdir(BubbleSort);
        System.out.println("-----------------------------------------------------------------");

        //-------------------------------------------------------------------------------------

        int[] SelectionSort = sort.selectionSort(dizi);
        System.out.println("2 - Selection Sort");
        sort.diziYazdir(SelectionSort);
        System.out.println("------------------------------------------------------------------");

        //-------------------------------------------------------------------------------------
        int[] QuickSort = sort.QuickSort(dizi);
        System.out.println("3 - Quick Sort");
        sort.diziYazdir(QuickSort);
        System.out.println("-----------------------------------------------------------------");



    }
}