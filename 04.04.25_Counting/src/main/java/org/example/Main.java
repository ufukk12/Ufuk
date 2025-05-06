package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CountingSort sort = new CountingSort();
        Scanner input = new Scanner(System.in);
        int[] dizi = {2 , 2 , 6 , 2 , 9 , 9 , 6 , 4 , 5 , 5 , 9};
        // 2,2,2,4,5,5,6,6,9,9,9

        /*
        Counting sort gnl olarak bir elemandan kaç tane olduğunu sayar
                yukarıdaki dizi için;
                        -0 -> 0         5 -> 4
                         1 -> 2         6 -> 1
                         2 -> 2         9->  2
                         3 -> 1
                         4-> 0                   olduğunu sayar ve ekrana yazar.

         */

        // 2. bir diziy ihtiyac var (her elemandan kaç tane olduğunu tutar.)

        int[] sortedArr = sort.countingSort(dizi);
        sort.diziyiSırala(sortedArr);







    }
}