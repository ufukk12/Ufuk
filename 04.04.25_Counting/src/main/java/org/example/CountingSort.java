package org.example;

public class CountingSort {

    // burada izleyecgmiz yol max elemanı bulup diziyi gzmek

    /*
    countArr = 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0
             = 0 , 0 , 3 , 0 , 1 , 2 , 2 , 0 , 0 , 3
         countArr[i] = i. elemandan kaç tane oldugunu gosteren dizi.
     */

    private int max(int[] arr){
        int max = 0;

        for(int num : arr){
            if (num >= max){
                max = num;
            }
        }
        return max;
    }

   public int[] countingSort(int[] arr){
        int max = max(arr);
        int[] countArr = new int[max+1];
        int[] sortedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
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

   public void diziyiSırala(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
   }
}

