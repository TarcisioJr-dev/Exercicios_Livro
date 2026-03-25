import java.util.LinkedList;

public class ExemploDeque {
    public static void main(String[] args) {
        //Usando a implementação nativa para simplificar o conceito
        LinkedList<Integer> deque = new LinkedList<>();

        deque.add(10); // Inserir no início

        System.out.println(deque);
        
        int primeiro = deque.removeFirst(); // Remove do início (10)
        int ultimo = deque.removeLast(); // Remove do fim (20)

    }
}
