package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
     Bubble sort basit olarak sıralı ikili kontrolü yapar
              dizi[i+1]<?dizi[i]
          evetse yer değiştir devam et
          hayırsa i++;
         */

        BubbleSort bs = new BubbleSort();

        int[] dizi = {10 , 2 , 7 , 5 , 11 , 3 , 9};
        int[] sıralanmışDizi = bs.bubbleSort(dizi , 0);

        for (int i = 0; i < sıralanmışDizi.length; i++){
            System.out.println(sıralanmışDizi[i]);
        }






    }
}