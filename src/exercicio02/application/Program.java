package exercicio02.application;
import java.util.*;

import exercicio02.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        Product vect [] = new Product[n];

        for(int i = 0; i < vect.length; i++){ 
            scanner.nextLine();
            System.out.print("Enter the product's name: ");         
            String name = scanner.nextLine();
            System.out.print("Enter the product's price: ");
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price); 
        }
        double sum = 0.0;

        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        scanner.close();
    }
}
