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

    public double[] results(int rows){
        double[] results = new double[rows];
        for (int i=0;i<rows;i++){
            results[i]=input.nextInt();
        }
        return results;
    }

    private double[][] extraMatrix(double[][] matrix , double[] result ){
        int matrixRows = matrix.length;
        int matrixColumns = matrix[0].length;

        double[][] extraMatrix = new double[matrixRows][matrixColumns+1];

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

    private int findPivot(double[][] matrix , int row){
        for (int i=0;i<matrix[0].length;i++){
            if(matrix[row][i] != 0) {
                return i;
            }
         }
        return -1;
     }

    /*/
    private double[][] eshelonForm(double[][] matrix , int sayac){
        int matrixRow = matrix.length;
        int matrixColumn = matrix[0].length;

        int pivotİndex = findPivot(matrix, sayac );
        double pivot = matrix[sayac][pivotİndex];

        if (sayac == (matrixRow-1)){
            return matrix;
        }


            for(int i=0;i<matrixColumn;i++){
                matrix[sayac+1][i] += -1*(matrix[sayac][i])*(matrix[sayac+1][pivotİndex] / pivot);
            }



        sayac++;
        return eshelonForm(matrix , sayac);
    }
     */

    private double[][] eshelonForm(double[][] matrix, int sayac) {
        int matrixRow = matrix.length;
        int matrixColumn = matrix[0].length;

        // Eğer sayac (satır indeksi) son satırı geçtiyse işlemi bitir
        if (sayac >= matrixRow) {
            return matrix;
        }

        // Pivot sütununu bul
        int pivotİndex = findPivot(matrix, sayac);

        // Pivot bulunamadıysa veya geçerli değilse bir sonraki satıra geç
        if (pivotİndex == -1 || matrix[sayac][pivotİndex] == 0) {
            return eshelonForm(matrix, sayac + 1);
        }

        double pivot = matrix[sayac][pivotİndex];

        // Pivotun altındaki tüm satırlar için satır işlemi uygula
        for (int row = sayac + 1; row < matrixRow; row++) {
            double factor = matrix[row][pivotİndex] / pivot;

            for (int col = 0; col < matrixColumn; col++) {
                matrix[row][col] -= factor * matrix[sayac][col];
            }
        }

        // Bir sonraki satıra geç ve işlemi tekrarla
        return eshelonForm(matrix, sayac + 1);
    }

    public double[] solveLineerSystem(double[][] matrix , double[] result ){
        double[][] extraMatrix = extraMatrix(matrix,result);
        double[][] eshelonMatrix = eshelonForm(extraMatrix ,0);
        int matrixRows = matrix.length;
        int matrixColumns = matrix[0].length;

        //bilinmeyenlerin cevaplarının depolanacagı küme
        double[] solution = new double[matrixRows];

        for(int i=0; i<matrixColumns-1; i++){
            if (eshelonMatrix[matrixRows-1][i] == 0 & eshelonMatrix[matrixRows-1][matrixColumns-1] == 0){
                yazdır("bu sistemin çözüm kümesi sonsuz elemanlıdır");
                return null;

            }else if(matrix[matrixRows-1][i] == 0 & matrix[matrixRows-1][matrixColumns-1] != 0){
                yazdır("Uğraşma kiral çözemezsin bunu bu sistem onun seni niye sebebsizce bırakması ile aynı");
                return null;

            }else {
                for (int k = 0; k < solution.length; k++){
                    solution[i] = 0;
                }
            }

            }
        return solution;
        }
    }

