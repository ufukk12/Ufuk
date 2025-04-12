package org.example;

public class BubbleSort {

    public int[] bubbleSort(int[] array, int sayac) {

        // sayac  ==  0
        if(array.length < 2) {
            return array;
        }

        if(sayac == array.length-1) {
            return array;
        }

        if(array[sayac] > array[sayac+1]) {
            int temp = array[sayac];
            array[sayac] = array[sayac + 1];
            array[sayac + 1] = temp;
            sayac = 0;
            return bubbleSort(array, sayac );
        }else{
            return bubbleSort(array, sayac + 1);
        }






    }

    public int[] diziÜret(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }

}

