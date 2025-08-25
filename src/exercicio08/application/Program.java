package exercicio08.application;

import java.util.Scanner;
import exercicio08.entities.Merchant;
import exercicio08.entities.Product;

public class Program {

    /*Fazer um programa para ler um número inteiro N e em seguida os dados de N comerciantes. Cada comerciante possui um nome e uma lista de N produtos que ele vende. Cada produto possui nome, preço de compra e preço de venda.
    O programa deverá imprimir um relatório com o nome de cada comerciante e o lucro total dele (a soma dos lucros de cada produto). O lucro de um produto é calculado pela diferença entre o preço de venda e o preço de compra.
    Além disso, o programa deverá classificar o lucro de cada comerciante em três faixas:
    -> Lucro Abaixo de 10%: para lucro total menor que 10% do valor total de compra.
    -> Lucro Entre 10% e 20%: para lucro total entre 10% e 20% do valor total de compra.
    -> Lucro Acima de 20%: para lucro total acima de 20% do valor total de compra.
    Ao final, o programa deve mostrar um resumo com o total de comerciantes em cada faixa de lucro e o lucro total geral de todos os comerciantes.

    Write a program to read an integer N and then the data from N merchants. Each merchant has a name and a list of N products they sell. Each product has a name, purchase price, and selling price.
    The program should print a report with each merchant's name and their total profit (the sum of each product's profits). A product's profit is calculated by the difference between the selling price and the purchase price.
    In addition, the program should classify each merchant's profit into three ranges:
    -> Profit Below 10%: for total profit less than 10% of the total purchase value.
    -> Profit Between 10% and 20%: for total profit between 10% and 20% of the total purchase value.
    -> Profit Over 20%: for total profit above 20% of the total purchase value.
    At the end, the program should display a summary with the total number of merchants in each profit range and the overall total profit for all merchants.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int under10 = 0;
        int between10and20 = 0;
        int over20 = 0;
        double overallTotalProfit = 0.0;


        System.out.print("How many merchants' data will be entered? ");
        int n = scanner.nextInt();

        Merchant merchant[] = new Merchant[n];

        for(int i = 0; i < merchant.length; i++){
            scanner.nextLine();
            System.out.println("Enter the #" + (i+1) + " merchant's data: ");
            System.out.print("Name: ");
            String merchantName = scanner.nextLine();
            System.out.print("How many products?");
            int productQuantity = scanner.nextInt();
            merchant[i] = new Merchant(merchantName, productQuantity);
            for(int j = 0; j < productQuantity; j++){
                scanner.nextLine();
                System.out.println("Product #" + (j + 1) + ":");
                System.out.print("Product name: ");
                String productName = scanner.nextLine();
                System.out.print("Purchase price: ");
                double purchasePrice = scanner.nextDouble();
                System.out.print("Sale price: ");
                double salePrice = scanner.nextDouble();
                Product product = new Product(productName, purchasePrice, salePrice);
                merchant[i].getProducts()[j] = product;
            }
        }

        System.out.println("Report: ");
        for(int i = 0; i < merchant.length; i++){
            double profit = merchant[i].getTotalProfit();
            double getTotalPurchase = merchant[i].getTotalPurchase();
            double profitPercentage = (profit/getTotalPurchase) * 100;

            if(profitPercentage < 10){
                under10 ++;
            }else if(profitPercentage <= 20){
                between10and20++;
            }else{
                over20++;
            }
            overallTotalProfit += profit;
        }
        System.out.println("Profit below 10%: " + under10);
        System.out.println("Profit between 10% and 20%: " + between10and20);
        System.out.println("Profit over 20%: " + over20);
        System.out.printf("Overall total profit: %.2f%n", overallTotalProfit);

        scanner.close();
    }
}
