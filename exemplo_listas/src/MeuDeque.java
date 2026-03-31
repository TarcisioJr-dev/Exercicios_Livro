import java.util.LinkedList;

public class MeuDeque {
    private LinkedList<Integer> deque;

    public MeuDeque() {
        deque = new LinkedList<>();
    }
    
    public void adicionarInicio(int valor){
        deque.addFirst(valor);
    }

    public void adicionarFim(int valor){
        deque.addLast(valor);
    }

    public int removerInicio() {
        if (deque.isEmpty()) {
            System.out.println("Deque vazio, não há elementos para remover.");
            return -1;
        } else {
            int valor = deque.removeFirst();
            return valor;
        }
    }

    public int removerFim() {
        if (deque.isEmpty()) {
            System.out.println("Deque vazio, não há elementos para remover.");
            return -1;
        } else {
            int valor = deque.removeLast();
            return valor;
        }
    }

    public void mostrarDeque(){
        System.out.printf("\nDeque: %d", deque);
    }
}
