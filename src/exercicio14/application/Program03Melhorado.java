package exercicio14.application;

import java.util.Scanner;

public class Program03Melhorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] lista = new String[5];

        int cont = 5;
        lista = preencherLista();
        System.out.println("Insira um convidado: ");
        String elemento = scanner.nextLine();
        lista = insere(lista, elemento, cont);
        imprimirLista(lista);


        scanner.close();
    }

    static String [] insere(String lista [], String elemento, int ultimo){
        String [] lista2;
        if(!(ultimo >= lista.length)){
            lista[ultimo] = elemento;
            return lista;
        }else{
            lista = aumentaLista(lista);
            lista[lista.length - 1] = elemento;
            return lista;
        }
    }

    static void imprimirLista(String lista []){
        System.out.println("--- Lista de Convidados ---");
        for(int i = 0; i < lista.length; i++){
            if(lista[i] != null){
                System.out.println((i + 1) + " - " + lista[i]);
            }
        }
    }

    static String [] aumentaLista(String lista[]){
        String [] listaMaior = new String[lista.length*2];
        for(int i = 0; i < lista.length; i++){
            listaMaior[i] = lista[i];
        }
        lista = listaMaior;
        return lista;
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
}
