package exercicio04.application;

import java.util.Scanner;

public class Program {
    /*Faça um programa para ler dois vetores A e B, contendo N elementeos cada. Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. 
    * Imprima o vetor C gerado
    * 
    * Write a program to read two vectors A and B, each with N elements. Then generate a third vector C, where each element of C is the sum of the corresponding elements of A and B. 
    * Print the generated vector C.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many values will each vector have? ");
        int n = scanner.nextInt();

        int vectA [] = new int[n];
        int vectB [] = new int[n];
        int vectC [] = new int[n];

        for(int i = 0; i < vectA.length; i++){
            System.out.print("Enter a value for Vector A at position " + i + ": ");
            vectA[i] = scanner.nextInt();

            System.out.print("Enter a value for Vector B at position " + i + ": ");
            vectB[i] = scanner.nextInt();

            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("Resulting Vector C:");
        for(int i = 0; i < vectA.length; i++){
            System.out.println(vectC[i]);
        }
        scanner.close();
    }
}
