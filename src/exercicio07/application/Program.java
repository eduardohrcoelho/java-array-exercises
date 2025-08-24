package exercicio07.application;

import java.util.Scanner;

import exercicio07.entities.Student;

public class Program {
    /* Fazer um programa para ler um número inteiro N e os dados (nome e duas notas semestrais) de N alunos.
    Em seguida, o programa deve mostrar o nome dos alunos aprovados, considerando que a média para aprovação é 6.0.

    Write a program to read an integer N and the data (name and two semester grades) for a student.
    Then, the program should display the names of the approved students, considering that the passing average is 6.0.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students will be typed?");
        int n = scanner.nextInt();

        Student student [] = new Student [n];

        for(int i = 0; i < student.length; i++){
            scanner.nextLine();
            System.out.println("Enter the #" + (i+1)+ " student's data");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("First grade: ");
            double firstGrade = scanner.nextDouble();
            System.out.print("Second grade: ");
            double secondGrade = scanner.nextDouble();

            student[i] = new Student(name, firstGrade, secondGrade);
        }

        System.out.println("Approved students: ");

        for(int i = 0; i < student.length; i++){
            if(student[i].getGradeAvg() >= 6){
                System.out.println(student[i].getName());
            }
        }

        scanner.close();
    }
}
