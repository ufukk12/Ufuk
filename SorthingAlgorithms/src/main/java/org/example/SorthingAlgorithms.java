package org.example;

public class SorthingAlgorithms {

    private void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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
            swap(dizi,sayac,sayac+1);
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
                    swap(dizi, minIndex, j);
                }else {
                    minIndex = j;
                }
            }
        }
        return dizi;
    }

    public void QuickSort(int[] dizi , int ilk , int son) {

        if (ilk < son){
            int pivot =parçayaAyir(dizi,ilk,son);
            QuickSort(dizi,ilk,pivot - 1);
            QuickSort(dizi,pivot+1,son);
        }


    }

    private int parçayaAyir(int[] dizi , int ilk , int son) {
        int pivotElmn = dizi[son];
        int sayac = (ilk - 1);

        for (int j = 0 ; j <= (son-1) ; j++) {
            if (dizi[j] < pivotElmn) {
                sayac++;
                swap(dizi,j, sayac);
            }
        }

        swap(dizi,sayac+1,son);
        return (sayac + 1);
    }

    private int maxBul(int[] arr){
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int[] countingSort(int[] dizi) {
        int max = maxBul(dizi);
        int[] countArr = new int[max+1];
        int[] sortedArr = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {
            countArr[dizi[i]]++;
        }

        int k = 0;
        for (int i = 0; i < max+1; i++) {
            if(countArr[i] != 0){
                for (int j = 0; j < countArr[i] ; j++) {
                    sortedArr[k] = i;
                    k++;
                }
            }
        }
        return sortedArr;
    }
}



