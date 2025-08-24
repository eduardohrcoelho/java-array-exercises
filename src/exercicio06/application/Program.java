package exercicio06.application;

import java.util.Scanner;

public class Program {

    /*Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros.
    Ao final, mostrar a matriz na tela e depois ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver. 
    
    Write a program to read two integers, M and N, and then read a matrix of M rows by N columns containing integers.
    Finally, display the matrix on the screen and then read an integer X from the matrix. For each occurrence of X, display the values ​​to the left, above, right, and below X, if any.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        int mat [][] = new int [n][m];

        System.out.println("\nEnter the matrix values: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the number to search for: ");
        int x = scanner.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Occurrence at position [" + i + ", " + j + "]:");
                    if(i > 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    if(j > 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    
                }   
            }
        }
        scanner.close();
    }
}
