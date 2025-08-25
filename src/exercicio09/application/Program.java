package exercicio09.application;

import java.util.Scanner;
import exercicio09.entities.Guest;


public class Program {
    
    /* A dona de um pensionato possui dez quartos para alugar para estudantes, sendoesses quartos identificados pelos números 0 a 9. 
    Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos (N pode ser de 1  a 10).
    Em seguida, registre o aluguel dos N estudantes. Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu. Ao final, seu programa deve imprimir
    um relatório de todas ocupações do pensionato, por ordem de quarto.
    The owner of a boarding house has ten rooms to rent to students, identified by the numbers 0 to 9.
    Write a program that starts with all ten rooms empty, and then reads a number N representing the number of students who will rent rooms (N can be from 1 to 10).
    Next, record the rents for the N students. For each rental record, enter the student's name and email address, as well as which room they chose. Finally, your program should print
    a report of all occupancies in the boarding house, sorted by room.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();

        Guest rooms [] = new Guest[10];

        for(int i = 0; i < n; i++){
            scanner.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int roomNumber = scanner.nextInt();
            rooms[roomNumber] = new Guest(name, email);
        }

        System.out.println("Busy rooms: ");
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }

        scanner.close();
    }
}
