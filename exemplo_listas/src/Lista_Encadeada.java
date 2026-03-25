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
}
