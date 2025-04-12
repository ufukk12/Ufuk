package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Functions fnc = new Functions();

        fnc.mesajYazdir("Lütfen denklem (satır) sayısını giriniz: ");
        int satır = 0;
        satır = fnc.satırAl(satır);

        fnc.mesajYazdir("Lütfen bilinmeyen (sütun) sayısını giriniz;");
        int sütun = 0;
        sütun = fnc.sütunAl(sütun);

        int[][] matrix = fnc.matrixÜret(satır , sütun);

        //Satır -1 sütun-1 MATRİSİN HER ZAMAN SON ELEMANI

        fnc.mesajYazdir("Lütfen sırasyla denklemlerin sonuclarını girin");
        int[] sonuclar = fnc.sonuçAl(satır);

        int[][] genişlemişMatris = fnc.GenişletilmişYap(matrix , satır , sütun , sonuclar);

        int[][] eselonMatris = fnc.eselonFormInt(genişlemişMatris , satır , sütun);

        for (int i = 0; i < satır; i++) {
            for (int j = 0; j<= sütun; j++) {
                System.out.println(eselonMatris[i][j]);
            }
        }
        }









    }
