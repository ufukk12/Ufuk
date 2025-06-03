package org.example;

import java.util.Scanner;

public class Process {



    Scanner input = new Scanner(System.in);
    public void yazdır(String input){
        System.out.println(input);
    }

    public int getRow() {
        int row = input.nextInt();

        if (row < 1) {
            yazdır("Matrisin Satır Sayısı 1 den küçük olamaz. Tekrar Satır Değeri Girin.");
            return getRow();
        } else {
            return row;
        }
    }

    public int getColumn(){
        int column = input.nextInt();

        if (column<1){
            yazdır("Matrisin Satır Sayısı 1 den küçük olamaz. Tekrar Satır Değeri Girin.");
            return getColumn();
        }else{
            return column;
        }

    }

    public int[] results(int rows){
        int[] results = new int[rows];
        for (int i=0;i<rows;i++){
            results[i]=input.nextInt();
        }
        return results;
    }

    private int[][] extraMatrix(int[][] matrix , int[] result ){
        int matrixRows = matrix.length;
        int matrixColumns = matrix[0].length;

        int[][] extraMatrix=new int[matrixRows][matrixColumns+1];

        for(int i=0;i<matrixRows;i++){
            for(int j=0;j<matrixColumns; j++){
                extraMatrix[i][j]=matrix[i][j];
            }

        }

        for (int i=0;i< matrix.length;i++){
            extraMatrix[i][matrix[0].length]= result[i];
        }

        return extraMatrix;
    }

    private int findPivot(int[][] matrix , int row){
        for (int i=0;i<matrix[0].length;i++){
            if(matrix[row][i] != 0) {
                return i;
            }
         }
        return -1;
     }

    private int[][] eshelonForm(int[][] matrix , int sayac){
        int matrixRow = matrix.length;
        int matrixColumn = matrix[0].length;

        int pivotİndex = findPivot(matrix, sayac );
        int pivot = matrix[sayac][pivotİndex];

        if (sayac == (matrixRow-1)){
            return matrix;
        }
        if(matrix[sayac+1][pivotİndex] != 0){
            for(int i=0;i<matrixColumn;i++){
                matrix[sayac+1][i] -= ((matrix[sayac+1][pivotİndex]) / pivot) + matrix[sayac+1][i] - 1;
            }
        }

        sayac++;
        return eshelonForm(matrix , sayac);
    }

    public double[] solveLineerSystem(int[][] matrix , int[] result ){
        int[][] extraMatrix = extraMatrix(matrix,result);
        int[][] eshelonMatrix = eshelonForm(extraMatrix ,0);
        int matrixRows = eshelonMatrix.length;
        int matrixColumns = eshelonMatrix[0].length;

        //bilinmeyenlerin cevaplarının depolanacagı küme
        double[] solution = new double[matrixRows];

        for(int i=0; i<matrixColumns-1; i++){
            if (eshelonMatrix[matrixRows-1][i] == 0 & eshelonMatrix[matrixRows-1][matrixColumns-1] == 0){
                yazdır("bu sistemin çözüm kümesi sonsuz elemanlıdır");

            }else if(matrix[matrixRows-1][i] == 0 & matrix[matrixRows-1][matrixColumns-1] != 0){
                yazdır("Uğraşma kiral çözemezsin bunu bu sistem onun seni niye sebebsizce bırakması ile aynı");

            }else {
                for (int k = 0; k < solution.length; k++){
                    solution[i] = 0;
                }
            }

            }
        return solution;
        }
    }

