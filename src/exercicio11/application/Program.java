package exercicio11.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        
        media = soma/(mat.length * mat.length);
        System.out.println(media);

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=====================");

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] > media){
                    mat[i][j] = 1;
                }else{
                    mat[i][j] = 0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        

        scanner.close();
    }
}
