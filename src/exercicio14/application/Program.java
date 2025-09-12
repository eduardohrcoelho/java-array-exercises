package exercicio14.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] nomes = new String[5];
        int cont = 0;
        

        System.out.println("Preencha a lista de convidados: ");
        while(true){
            System.out.print("Informe o nome do " + (cont + 1) + "º convidado: ");
            nomes[cont] = scanner.nextLine();
            cont++;
            if(cont >= nomes.length){
                String [] aux = new String[nomes.length];
                for(int i = 0; i < cont; i++){
                    aux[i] = nomes[i];
                }
                nomes = aux;
            }
            System.out.println("Deseja continuar? (S/N) ");
            char resp = scanner.next().toUpperCase().charAt(0);
            if(resp == 'N'){
                break;
            }
            scanner.nextLine();
        }

        System.out.println("---- Lista de Convidados: ");

        for(int i = 0; i < cont; i++){
            System.out.println((i + 1) +  " - " + nomes[i]);
        }
        scanner.nextLine();
        System.out.println("\n--- Pesquisar Convidado na Lista ---");
        
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
        scanner.close();
    }
}
