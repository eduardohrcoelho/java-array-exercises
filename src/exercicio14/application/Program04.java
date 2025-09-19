package exercicio14.application;

public class Program04 {
    public static void main(String[] args) {
        String v [] = new String [3];
        int cont = 0;

        cont = insere(v, "Jose de Alencar", cont);
        cont = insere(v, "Graciliano Ramos", cont);
        cont = insere(v, "Guimaraes Rosa", cont);

        System.out.println("\n--- Lista ---");
        imprimir(v, cont);

        System.out.println("\n--- Pesquisar ---");
        String pesquisar = pesquisar(v, "Jose de Alencar", cont);
        if(pesquisar != null){
            System.out.println(pesquisar + " está na lista.");
        }else{
            System.out.println(pesquisar + " não está na lista.");
        }

        int indice = pesquisarPos(v, "Graciliano Ramos", cont);
        System.out.println("\n--- Excluir ---");
        String exlcuido = excluir(v, indice, cont);
        System.out.println(exlcuido +" excluido");
        cont--;
        System.out.println("\n--- Lista Atualizada ---");
        imprimir(v, cont);

    }

    static int insere(String [] v, String elemento, int ultimo){
        if(ultimo < v.length){
            v[ultimo] = elemento;
            return ultimo + 1;
        }
        return ultimo;
    }

    static void imprimir(String [] v, int ultimo){
        for(int i = 0; i < ultimo; i++){
            System.out.println(v[i]);
        }
    }

    static int pesquisarPos(String [] v, String elemento, int ultimo){
        for(int i = 0; i < ultimo; i++){
            if(v[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }

    static String pesquisar(String [] v, String elemento, int ultimo){
        for(int i = 0; i < ultimo; i++){
            if(v[i].equalsIgnoreCase(elemento)){
                return v[i];
            }
        }
        return null;
    }

    static String excluir(String [] v, int pos, int ultimo){
        if(pos < 0 || pos >= ultimo){
            return null;
        }
        String elementoRemovido = v[pos];
        for(int i = pos; i < ultimo - 1; i++){
            v[i] = v[i+ 1];
        }
        v[ultimo - 1] = null;
        return elementoRemovido;
    }

    static String excluirPrimeiro(String [] v, int ultimo){
        if(ultimo == 0){
            System.out.println("Erro: Lista vazia!");
            return null;
        }
        String primeiro = v[0];
        for(int i = 0; i < (ultimo - 1); i++){
            v[i] = v[i+1];
        }
        v[ultimo - 1] = null;
        return primeiro;
    }

    static String excluirUltimo(String [] v, int ultimo){
        if(ultimo == 0){
            System.out.println("Erro: Lista vazia!");
            return null;
        }
        return (v[ultimo - 1]);
    }
}
