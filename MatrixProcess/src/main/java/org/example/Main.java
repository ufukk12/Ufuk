package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Process process = new Process();
        int rows = 0;
        int coulum = 0;
        process.yazdır("Lütfen Matrisin Satır Sayısını Giriniz");
        rows = process.getRow();

        process.yazdır("Lütfen Matrisin Sütun Sayısını Giriniz");
        coulum = process.getColumn();

        int[][] matrix = new int[rows][coulum];

        process.yazdır("Lütfen matrisin sırasıyla satırlarını girin");
        for (int i = 0; i < rows; i++) {
            process.yazdır((i+1) + ". satırdasınız ");
            for (int j = 0; j < coulum; j++) {
                process.yazdır((j+1) +". sütundasınız");
                matrix[i][j] = input.nextInt();
            }

        }
        process.yazdır("Lütfen sırasıyla yukarıdan aşagı olacak sekilde sonucları girin");
        int[] results = process.results(rows);

        double[] çözümler = process.solveLineerSystem(matrix , results);

        for (double num : çözümler){
            System.out.println(num);
        }

    }
}