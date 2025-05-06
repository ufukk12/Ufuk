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
        sort.QuickSort(dizi, 0 , dizi.length-1);
        System.out.println("3 - Quick Sort");
        sort.diziYazdir(dizi);
        System.out.println("-----------------------------------------------------------------");

        //-------------------------------------------------------------------------------------
        sort.countingSort(dizi);
        System.out.println("4 - Counting Sort");
        sort.diziYazdir(dizi);


    }
}