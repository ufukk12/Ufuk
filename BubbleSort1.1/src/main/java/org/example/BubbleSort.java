package org.example;

public class BubbleSort {
    public int[] sort(int[] array , int sayac) {


        if (array.length <= 1) {
            return array;
        }

        if (sayac == array.length - 1) {
            return array;
        }

        if (array[sayac] < array[sayac + 1]) {
            return sort(array, sayac + 1);


        }else {
            int temp = array[sayac];
            array[sayac] = array[sayac+1];
            array[sayac+1] = temp;
            sayac = 0;

            return sort(array,sayac);
        }
    }

    public int[] diziÜret(int uzunluk) {
        int[] array = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            array[i] =(int)(Math.random()*100);
        }
        return array;
    }

//q
}

