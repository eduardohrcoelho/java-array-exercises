package exercicio11.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Random random = new Random();
        int n;
        double soma = 0.0;
        double media = 0.0;

        do{
            System.out.print("Informe o tamanho da matriz (Número inteiro maior ou igual a 5): ");
            n = scanner.nextInt();
            if(n < 5){
                System.out.println("O número que você digitou é menor que 5. Informe um novo número maior ou igual a 5!\n");
            }
        }while(n < 5);
        
        int [][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = random.nextInt(10);
                soma += mat[i][j];
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        media = soma/(mat.length * mat.length);
        System.out.printf("\nMédia geral: %.2f",media);
        System.out.println();
        matrizBinaria(mat, media, n);
        System.out.println();
        matrizExplosao(mat, n);

        scanner.close();
    }

    static void matrizExplosao(int [][] mat, int n){
        
        System.out.println("Matriz após explosão: ");
        if((n + 1) % 2 == 0){
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    if(i == (n-1)/2 && j == (n -1)/2){
                        mat[i][j] = 0;
                        mat[i - 1][j] = 0;
                        mat[i + 1][j] = 0;
                        mat[i][j - 1] = 0;
                        mat[i][j + 1] = 0;
                    }
                }
            }

            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    if(i == n/2 && j == (n/2)-1){
                        mat[i][j] = 0;
                        mat[i - 1][j] = 0;
                        mat[i - 1][j + 1] = 0;
                        mat[i][j + 1] = 0;
                    }
                }
            }
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat.length; j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }   
    }

    static void matrizBinaria(int [][] mat, double media, int n){
        int [][] mat2 = new int[n][n];
        
        System.out.println("Matriz binária (críticos = 1): ");
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat2[i][j] = mat[i][j];
                if(mat2[i][j] > media){
                    mat2[i][j] = 1;
                }else{
                    mat2[i][j] = 0;
                }
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
