package org.example;

import java.util.Scanner;

public class Functions {

    Scanner input = new Scanner(System.in);

    public void mesajYazdir(String input){
        System.out.println(input);
    }

    public int satırAl(int satır){
        satır = input.nextInt();
        return satır;
    }

    public int sütunAl(int sütun){
        sütun = input.nextInt();
        return sütun;
    }

    public int[][] matrixÜret(int satır , int sütun){
        if (satır <= 0){
            mesajYazdir("Satır sayısı 0 olamaz");
            mesajYazdir("Lütfen satır sayısını tekrar giriniz.");
            int yeniSatır = input.nextInt();
            matrixÜret(yeniSatır , sütun);
        }

        if (sütun <= 0){
            mesajYazdir("sütun sayısı 0 olamaz");
            mesajYazdir("Lütfen sütun sayısını tekrar giriniz.");
            int yeniSütun = input.nextInt();
            matrixÜret(satır , yeniSütun);
        }

        int[][] matrix = new int[satır][sütun];

        for (int i = 0; i < satır; i++){
            System.out.println((i+1) + ". satırdasınız.");
            for (int j = 0; j <sütun; j++){
                System.out.println("Lütfen" + (j+1) + "Sütnun elemanını girin");
                matrix[i][j] = input.nextInt();

            }
        }

        return matrix;
    }

    public int[] sonuçAl(int satır){
        int[] sonuc = new int[satır];
        for (int i = 0; i < satır; i++){
            sonuc[i] = input.nextInt();

        }
        return sonuc;
    }

    //Yukarıdaki matris üretme işleminin aynısını reküsif olarak yap!

    public int[][] GenişletilmişYap(int[][] matrix, int satir, int sutun, int[] sonuc) {
        int[][] yeniMatrix = new int[satir][sutun + 1];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                yeniMatrix[i][j] = matrix[i][j];
            }
            yeniMatrix[i][sutun] = sonuc[i];
        }

        return yeniMatrix;
    }
//ChatGBT
    public int[][] eselonFormInt(int[][] matris, int satir, int sutun) {
        int pivotSatir = 0;

        for (int pivotSutun = 0; pivotSutun < sutun; pivotSutun++) {
            // Pivot satır seç
            int maxSatir = pivotSatir;
            for (int i = pivotSatir; i < satir; i++) {
                if (Math.abs(matris[i][pivotSutun]) > Math.abs(matris[maxSatir][pivotSutun])) {
                    maxSatir = i;
                }
            }

            // Sıfır pivot kontrolü
            if (matris[maxSatir][pivotSutun] == 0) {
                continue;
            }

            // Satır değiştir
            int[] temp = matris[pivotSatir];
            matris[pivotSatir] = matris[maxSatir];
            matris[maxSatir] = temp;

            // Alt satırları sıfırla
            for (int i = pivotSatir + 1; i < satir; i++) {
                int a = matris[i][pivotSutun];
                int b = matris[pivotSatir][pivotSutun];

                for (int j = 0; j < sutun; j++) {
                    // a * pivotSatir satır - b * i. satır
                    matris[i][j] = matris[i][j] * b - matris[pivotSatir][j] * a;
                }
            }

            pivotSatir++;

            if (pivotSatir == satir) break;
        }

        return matris;
    }


    private int pivotBul(int[][] matrix, int istenilenSatır, int sayac, int sütun){
        if(matrix[istenilenSatır][sayac] == 0){
            sayac++;
            return pivotBul(matrix, istenilenSatır , sayac, sütun);

        }else{
            return matrix[istenilenSatır][sayac];

        }


    }

    public int[] bilinmeyenler(int[][] matrix , int satır , int sütun){



        return null;

    }

    public void matrixYazdir(int[][] matrix , int satır , int sutun){
        
    }


}

