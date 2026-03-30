class No {
    int dado;
    No proximo; // Referência para o próximo objeto No
}

public class Lista_Encadeada {
    No inicio;

    public void inserir(int valor){
        No novoNo = new No();
        novoNo.dado = valor;
        novoNo.proximo = inicio; // O novo nó aponta para o antigo início
        inicio = novoNo; // O início agora é o novo nó
    }

    public void mostrarLista(){
        if (inicio == null) {
            System.out.println("Lista vazia.");
        } else {
            No atual = inicio;
            System.out.println("\nElementos da lista: ");
            while (atual != null) {
                System.out.println(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println("-------------------\n");
        }
    }

    public int retirar(){
        if (inicio == null) {
            System.out.println("Lista vazia, nada a retirar.");
            return -1; // valor especial indicando que não havia elementos
        } else {
            int valorRemovido = inicio.dado; //pega o valor do primeiro nó
            inicio = inicio.proximo; // move o início para o próximo nó
            System.out.printf("O valor %d foi removido com sucesso.", valorRemovido);
            return valorRemovido; //retorna o valor removido
        }
    }
}
