package exercicio15.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a figura que deseja calcular a area: (quadrado, circulo, retangulo, triangulo)");
        String figura = scanner.nextLine().toLowerCase();
        escolheFigura(figura, scanner);

        scanner.close();
    }

    static void escolheFigura(String figura, Scanner scanner){
        switch(figura){
            case "quadrado":
                double lado = lerEntrada(scanner, "Digite o lado do quadrado: ");
                double area = calculaAreaQuad(lado);
                System.out.println("A area do quadrado é: " + area);
                break;

            case "circulo":
                double raio = lerEntrada(scanner, "Digite o raio do circulo: ");
                area = calculaAreaCirc(raio);
                System.out.println("A area do circulo é: " + area);
                break;

            case "retangulo":
                double base = lerEntrada(scanner, "Digite a base do retangulo: ");
                double altura = lerEntrada(scanner, "Digite a altura do retangulo: ");
                area = calculaAreaRet(base, altura);
                System.out.println("A area do retangulo é: " + area);
                break;

            case "triangulo":
                base = lerEntrada(scanner, "Digite a base do retangulo: ");
                altura = lerEntrada(scanner, "Digite a altura do retangulo: ");
                area = calculaAreaTri(base, altura);
                System.out.println("A area do triangulo é: " + area);
                break;

            default:
                System.out.println("Figura não reconhecida!");
        }
    }

    static double lerEntrada(Scanner scanner, String mensagem){
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    static double calculaAreaQuad(double lado){
        return lado * lado;
    }

    static double calculaAreaRet(double base, double altura){
        return base * altura;
    }

    static double calculaAreaCirc(double raio){
        return (Math.PI * raio * raio);
    }

    static double calculaAreaTri(double base, double altura){
        return (base*altura)/2;
    }
}   
