package exercicio14.application;

import java.util.Scanner;

public class Program02Modularizado {
    public static void main(String[] args) {
        String lista[];

        lista = preencherLista();
        exibirLista(lista);
        buscarConvidado(lista);
    }

    static String[] preencherLista() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int cont = 0;
        do {
            System.out.println("Informe o nome do convidado: ");
            nomes[cont] = scanner.nextLine();
            cont++;
            if (cont >= nomes.length) {
                String[] aux = new String[nomes.length * 2];
                for (int i = 0; i < cont; i++) {
                    aux[i] = nomes[i];
                }
                nomes = aux;
            }
            System.out.println("Deseja continuar (S/N)");
            char rp = scanner.next().toUpperCase().charAt(0);
            if (rp == 'N') {
                break;
            }
            scanner.nextLine();
        } while (true);
        return nomes;
    }

    static void buscarConvidado(String[] nomes) {
        Scanner scanner = new Scanner(System.in);
        char op;
        boolean continuar = false;
        System.out.println("--- Pesquisar Convidado ---");

        do {
            System.out.print("Nome: ");
            String convidado = scanner.nextLine();
            boolean achou = false;
            for (int i = 0; i < nomes.length; i++) {
                if (convidado.equalsIgnoreCase(nomes[i])) {
                    achou = true;
                    break;
                }
            }
            if (achou) {
                System.out.println("Convidado na lista!");
            } else {
                System.out.println("Convidado não encontrado!");
            }
            System.out.print("Deseja buscar outro nome (S/N)? ");
            op = scanner.next().toUpperCase().charAt(0);
            if (op == 'N') {
                continuar = true;
            }
            scanner.nextLine();
        } while (!continuar);

    }

    static void exibirLista(String[] nomes) {
        System.out.println("--- Lista de Convidados ---");
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println(nomes[i]);
            }

        }
    }
}
