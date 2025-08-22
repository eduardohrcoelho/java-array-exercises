package exercicio01.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        System.out.print("Enter the number of people: ");
        int N = scanner.nextInt();

        double height[] = new double[N];
        for(int i = 0; i < height.length; i++){
            System.out.println("Enter the " + (i + 1) + "º person height: ");
            height[i] = scanner.nextDouble();
            sum += height[i];
        }

        double avg = sum/height.length;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        scanner.close();
    }
}
