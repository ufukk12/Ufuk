package org.example;

import java.util.Scanner;

public class Process {

    private int rows;
    private int coulums;

    public Process(int rows, int coulums) {
        this.rows = rows;
        this.coulums = coulums;
    }

    Scanner input = new Scanner(System.in);
    public void yazdır(String input){
        System.out.println(input);
    }

    public int getRow(int row){
        row=input.nextInt();

        if (row<1){
            yazdır("Matrisin Satır Sayısı 1 den küçük olamaz. Tekrar Satır Değeri Girin.");
            getRow(row);
        }
        return row;

    }

    public int getColumn(int column){
        column=input.nextInt();

        if (column<1){
            yazdır("Matrisin Satır Sayısı 1 den küçük olamaz. Tekrar Satır Değeri Girin.");
            getRow(column);
        }
        return column;
    }

    public int[] results(int[] result){
        for (int i=0;i<result.length;i++){
            result[i]=input.nextInt();
        }
        return result;
    }

    private int[][] extraMatrix(int[][] matrix , int[] result){
        int[][] extraMatrix=new int[rows][coulums + 1];
        for (int i=0;i<rows;i++){
            extraMatrix[i][coulums+1]= input.nextInt();
        }

        return extraMatrix;
    }




}
