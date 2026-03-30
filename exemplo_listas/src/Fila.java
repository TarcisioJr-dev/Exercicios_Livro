public class Fila {
    private int[] elementos;
    private int tamanho;

    public Fila(int capacidade){
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public void enfileirar(int valor){
        if (tamanho < elementos.length){
            elementos[tamanho] = valor; //Adiciona no fim
            tamanho++;
        }
    }

    public int desenfileirar(){
        if (tamanho == 0){
            System.out.println("\nPara remover precisa primeiro adicionar.");
        } else {
            int primeiro = elementos[0]; //Pega sempre o primeiro
            //Move todos os outros elementos uma posição para frente
            for (int i = 0; i < tamanho - 1; i++){
                elementos[i] = elementos[i + 1];
            }
            tamanho --;
            System.out.printf("\nO valor %d foi removido.", primeiro);
            return primeiro;
        }
        return -1;
    }

    public void mostrarFila(){
        if (tamanho == 0) {
            System.out.println("\nFila vazia.");
        } else {
            System.out.println("\nElementos da fila: ");
            for (int i = 0; i < tamanho; i++){
                System.out.println(elementos[1] + " ");
            }
            System.out.println("------------------------\n"); // Quebra de linha no final
        }
    }
}
