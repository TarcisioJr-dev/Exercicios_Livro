import java.util.LinkedList;

public class MeuDeque {
    private LinkedList<Integer> deque;

    public MeuDeque() {
        deque = new LinkedList<>();
    }
    
    public void adicionarInicio(int valor){
        deque.addFirst(valor);
    }
}
