package exercicio14.application;

import java.util.Scanner;

public class Program03Melhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lista;
        int cont = 0;

        lista = preencherLista(scanner);
        cont = contaPessoas(lista);
        scanner.nextLine();
        System.out.println("--- Insira um convidado ---");
        String convidado = lerConvidado(scanner);
        lista = insere(lista, convidado, cont);
        imprimirLista(lista);
        System.out.println("\n--- Pesquisa ---");
        convidado = lerConvidado(scanner);
        if (pesquisar(lista, convidado)) {
            System.out.println(convidado + " está na lista");
        } else {
            System.out.println(convidado + " não está na lista");
        }
        System.out.println("\n--- Remover ---");
        convidado = lerConvidado(scanner);
        lista = remover(lista, convidado);
        System.out.println("\n--- Lista atualizada ---");
        imprimirLista(lista);
        scanner.close();
    }

    static String lerConvidado(Scanner scanner) {
        System.out.println("Informe o nome do convidado: ");
        String convidado = scanner.nextLine();
        return convidado;
    }

    static String[] insere(String lista[], String elemento, int ultimo) {
        lista[ultimo] = elemento;
        return lista;
    }

    static void imprimirLista(String lista[]) {
        System.out.println("--- Lista de Convidados ---");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println((i + 1) + " - " + lista[i]);
            }
        }
    }

    static String[] aumentaLista(String lista[]) {
        String[] listaMaior = new String[lista.length * 2];
        for (int i = 0; i < lista.length; i++) {
            listaMaior[i] = lista[i];
        }
        lista = listaMaior;
        return lista;
    }

    static String[] preencherLista(Scanner scanner) {
        String[] nomes = new String[5];
        int cont = 0;
        do {
            System.out.println("Informe o nome do convidado: ");
            nomes[cont] = scanner.nextLine();
            cont++;
            if (cont >= nomes.length) {
                nomes = aumentaLista(nomes);
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

    static boolean pesquisar(String[] lista, String convidado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equalsIgnoreCase(convidado)) {
                return true;
            }
        }
        return false;
    }

    static String[] remover(String[] lista, String convidado) {
        int indice = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].equalsIgnoreCase(convidado)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            String[] novoVetor = new String[lista.length - 1];
            for (int i = 0, k = 0; i < lista.length; i++) {
                if (i != indice) {
                    if (k < novoVetor.length) {
                        novoVetor[k++] = lista[i];
                    }
                }
            }
            return novoVetor;
        }
        return lista;
    }

    static int contaPessoas(String[] lista) {
        int cont = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                cont++;
            }
        }
        return cont;
    }
}
