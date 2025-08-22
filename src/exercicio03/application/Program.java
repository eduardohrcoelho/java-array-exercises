package exercicio03.application;

import java.util.Scanner;

import exercicio03.entities.Person;

public class Program {
    /* Faça um programa para ler nome, idade e altura de N pessoas. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
     * bem como os nomes dessas pessoas caso houver.
     * 
     * Write a program to read the name, age, and height of N people. Then, display their average height on the screen, as well as the percentage of people under 16,
     * as well as their names, if applicable.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double underSixteen = 0.0;

        System.out.print("How many people will be typed? ");
        int n = scanner.nextInt();

        Person vect [] = new Person[n];
        for(int i = 0; i < vect.length; i++){
            scanner.nextLine();
            System.out.print("Enter the " + (i + 1) + "º person data: \n");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            if(age < 16){
                underSixteen++;
            }
            vect[i] = new Person(name, age, height);            
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getHeight();
        }
        double avg = sum/vect.length;
        double percentageUnderSixteen = (underSixteen/vect.length)*100.0;

        System.out.printf("Average height: %.2f%n", avg);
        System.out.printf("Percentage of people under 16 years old: %.1f%n", percentageUnderSixteen);
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        scanner.close();
    }
}
