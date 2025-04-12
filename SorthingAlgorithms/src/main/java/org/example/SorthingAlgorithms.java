package org.example;

public class SorthingAlgorithms {

    public void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public int[] diziUret(int uzunluk){
        int[] arr = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }

    public void diziYazdir(int[] dizi){
        for (int num : dizi){
            System.out.print(num + " ");
        }
    }

    public int[] bubbleSort(int[] dizi , int sayac) {

        if (dizi.length < 2){
            return dizi;
        }

        if (sayac == dizi.length-1){
            return dizi;
        }

        if(dizi[sayac] > dizi[sayac + 1]){
            int temp = dizi[sayac];
            dizi[sayac] = dizi[sayac + 1];
            dizi[sayac + 1] = temp;
            sayac = 0;
            return bubbleSort(dizi,sayac);
        }else {
            return bubbleSort(dizi,sayac+1);
        }
    }

    public int[] selectionSort(int[] dizi) {

        if (dizi.length < 2){
            return dizi;
        }

        for (int i = 0; i < dizi.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[minIndex] > dizi[j]) {
                    int temp = dizi[minIndex];
                    dizi[minIndex] = dizi[j];
                    dizi[j] = temp;
                }else {
                    minIndex = j;
                }
            }
        }
        return dizi;
    }

    public int[] QuickSort(int[] dizi) {

        return null;
    }
}



