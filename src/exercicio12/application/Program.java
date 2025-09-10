package exercicio12.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = false;

        String [] produtos = {"Arroz", "Feijão", "Macarrão"};
        int [] quantidade = {10, 10, 10};
        double[] preco = {7.00, 8.50, 4.00};

        do{ 
            System.out.println("1. Registrar venda");
            System.out.println("2. Registrar Entrada de Estoque");
            System.out.println("3. Listar Estoque Atual");
            System.out.println("4. Sair");
            int op = scanner.nextInt();
            System.out.println();
            switch(op){
                case 1:
                    System.out.println("Informe o código do produto: \n[0] - Arroz \n[1] - Feijão \n[2] - Macarrão");
                    int codigo = scanner.nextInt();
                    System.out.print("Informe a quantidade a ser vendida: ");
                    int quant = scanner.nextInt();
                    quantidade[codigo] = registrarVenda(codigo, quant, quantidade, preco);
                    break;

                case 2:
                    System.out.println("Informe o código do produto: \n[0] - Arroz \n[1] - Feijão \n[2] - Macarrão");
                    codigo = scanner.nextInt();
                    System.out.print("Informe a quantidade a ser adicionada: ");
                    quant = scanner.nextInt();
                    quantidade[codigo] = registrarEntrada(codigo, quant, quantidade);
                    break;

                case 3:
                    listarEstoque(produtos, quantidade);
                    break;

                case 4:
                    System.out.println("Programa encerrado!");
                    continuar = true;
                    break;
                    
                default:
                    System.out.println("Opção invalida");
            }
        }while(!continuar);


        scanner.close();
    }

    static int registrarVenda(int codigo, int quant, int [] estoque, double [] preco){
        if(quant > estoque[codigo]){
            System.out.println("Estoque insuficiente!\n");
            return estoque[codigo];
        }else{
            System.out.printf("Valor da venda: R$%.2f \n", (quant * preco[codigo]));
            return estoque[codigo] - quant;
        }
        
    }

    static int registrarEntrada(int codigo, int quant, int [] estoque){
        if(quant <= 0){
            System.out.println("Quantidade informada negativa!");
            return estoque[codigo];
        }else{
            System.out.println("Entrada registrada com sucesso!");
            return estoque[codigo] + quant;
        }
    }

    static void listarEstoque(String [] produtos, int [] estoque){
        for(int i = 0; i < produtos.length; i++){
            System.out.println(produtos[i] + ": " + estoque[i]);
        }
        System.out.println();
    }
}
