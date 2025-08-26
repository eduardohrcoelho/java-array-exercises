package exercicio10.application;

import java.util.*;

import exercicio10.entities.Product;

public class Program {

    /*  Fazer um programa para ler os dados de uma quantidade não determinada de produtos (id, nome e quantidade em estoque). O programa deve ler os produtos até que um id negativo seja digitado. Não deve haver repetição de ids. 
    Em seguida, o programa deve permitir que o usuário realize uma entrada de estoque. Para isso, o programa deve ler um id e a quantidade que será adicionada ao estoque daquele produto. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos produtos.

    Write a program to read data for an unspecified quantity of products (ID, name, and quantity in stock). The program should read the products until a negative ID is entered. There should be no repeating IDs.
    Then, the program should allow the user to enter inventory. To do this, the program should read an ID and the quantity that will be added to the inventory of that product. If the entered ID does not exist, display a message and abort the operation. Finally, display the updated product list.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        int count = 0;

        List<Product> product = new ArrayList<>();

        System.out.println("Enter the product's data (Negative ID to stop): ");
        do{
            System.out.println("Product #" + (count + 1)+ ": ");
            System.out.print("Id:");
            Integer id = scanner.nextInt();
            if(id < 0){
                stop = true;
                break;
            }
            if (hasId(product, id)) {
                System.out.println("ID já existe! Tente novamente para este produto.");
                continue; 
            }
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();
            product.add(new Product(id, name, quantity));

            count++;
        }while(!stop);

        System.out.print("\nEnter the product Id to enter the stock: ");
        Integer idProduct = scanner.nextInt();
        Integer iDFound = findId(product, idProduct);
        if(iDFound == null){
            System.out.println("This id does not exist.");
        }else{
            System.out.print("Enter the quatity to be added: ");
            Integer amount = scanner.nextInt();
            product.get(iDFound).setQuantity(amount);
            System.out.println("Entry registered successfully!");
        }

        System.out.println();
        System.out.println("Update products list: ");
        for(Product products : product){
            System.out.println(products);
        }

        scanner.close();
    }

    static Integer findId(List<Product> product, Integer id){
        for(int i = 0; i < product.size(); i++){
            if(product.get(i).getId().equals(id)){
                return i;
            }   
        }           
        return null;
    }

    static boolean hasId(List<Product> product, Integer id){
        for (Product p : product) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
