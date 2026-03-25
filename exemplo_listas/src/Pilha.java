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
            System.out.println("Valor inserido na PILHA com sucesso.\n");
            System.out.printf("O valor inserido foi: %s", valor);
        }

    }

    public int desempilhar(){

        int valor = elementos[topo]; //Pega o valor do topo
        topo--; // Desce o ponteiro, "esquecendo" o valor anterior
        System.out.println("Valor deletado com sucesso.\n");
        return valor;

    }

    public boolean estaVazia() {
        return (topo == -1);
    }

    public void exibirPilha(){
        if (topo == -1){
            System.out.println("A pilha está vazia!");
        } else {
            System.out.println("\n--- Conteúdo da Pilha (Topo para Base) ---");
            // O loop começa no 'topo' e vai descendo até o 0
            for (int i = topo; i >= 0; i--){
                System.out.printf("| %s | %n", elementos[i]);
            }
            System.out.println("----------");
        }
    }
}
