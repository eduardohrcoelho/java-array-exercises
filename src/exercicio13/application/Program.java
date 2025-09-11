package exercicio13.application;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        jogar();
    }

    static int gerarNumero(){
        Random random = new Random();
        return random.nextInt(1, 100);
    }

    static int pedirChute(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número entre 1 e 100: ");
        int chute = scanner.nextInt();
        return chute;
    }

    static boolean verificar(int chute, int numeroGerado){
        if(chute > numeroGerado){
            System.out.println("O número é menor.");
            return false;
        }else if(chute < numeroGerado){
            System.out.println("O número é maior");
            return false;
        }else{
            System.out.println("Acertou!");
            return true;
        }
    }

    static void jogar(){
        int chute;
        int numeroGerado;
        boolean continuar;
        int tentativas = 0;

        numeroGerado = gerarNumero();
        do{
            chute = pedirChute();
            continuar = verificar(chute, numeroGerado);
            tentativas++;
        }while(!continuar);
        System.out.println("\nNúmero de tentativas: " + tentativas);
    }
}
