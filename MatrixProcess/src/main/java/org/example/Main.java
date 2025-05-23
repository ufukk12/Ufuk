package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows = 0;
        int coulum = 0;
        Scanner input = new Scanner(System.in);
        Process process = new Process(rows , coulum);

        process.yazdır("Lütfen Matrisin Satır Sayısını Giriniz");
        rows = process.getRow(rows);

        process.yazdır("Lütfen Matrisin Sütun Sayısını Giriniz");
        coulum = process.getColumn(coulum);

        int[][] matrix = new int[rows][coulum];
        int[] results = new int[rows];

        results = process.results(results);


    }
}