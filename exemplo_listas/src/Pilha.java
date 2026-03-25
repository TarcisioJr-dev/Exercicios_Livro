public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade){
        elementos = new int[capacidade]; //Cria o "balde" para guardar os dados
        topo = -1; // -1 indica que a pilha está vazia
    }

    public void empilhar(int valor){
        if (topo < elementos.length - 1){
            topo ++; //Sobe o ponteiro do topo
            elementos[topo] = valor; // Guarda o valor na nova posição
        }
    }

    public int desempilhar(){
        if (topo != -1) {
            int valor = elementos[topo]; //Pega o valor do topo
            topo--; // Desce o ponteiro, "esquecendo" o valor anterior
            return valor;
        }
        return -1;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
