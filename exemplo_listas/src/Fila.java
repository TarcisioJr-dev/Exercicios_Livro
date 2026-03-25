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
        if (tamanho > 0){
            int primeiro = elementos[0]; //Pega sempre o primeiro
            //Move todos os outros elementos uma posição para frente
            for (int i = 0; i < tamanho - 1; i++){
                elementos[i] = elementos[i + 1];
            }
            tamanho --;
            return primeiro;
        }
        return -1;
    }
}
