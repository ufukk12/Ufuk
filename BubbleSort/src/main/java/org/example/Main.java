package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Bubble sort ikili kıyaslama yapar.
         *
         * dizi[i] < dizi[i+1];
         * i++
         */

        int uzunluk;

        Scanner scn = new Scanner(System.in);

        System.out.println("Lütfen sıralanacak dizi uzunluğu girin: ");
        uzunluk = scn.nextInt();




        SelectionSort sort = new SelectionSort();

        int dizi[] = sort.diziÜret(uzunluk);

        int sıralanmısDizi[] = sort.sort(dizi , 0);

        for (int i = 0; i < dizi.length; i++){
            System.out.println(sıralanmısDizi[i]);
        }

//a
    }
}