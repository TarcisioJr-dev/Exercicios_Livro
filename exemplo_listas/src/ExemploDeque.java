import java.util.LinkedList;

public class ExemploDeque {
    public static void main(String[] args) {
        //Usando a implementação nativa para simplificar o conceito
        LinkedList<Integer> deque = new LinkedList<>();

        deque.addFirst(10); // Inserir no início
        deque.addLast(20); // Inserir no fim

        System.out.println(deque);
        
        int primeiro = deque.removeFirst(); // Remove do início (10)
        int ultimo = deque.removeLast(); // Remove do fim (20)
        
        System.out.println(deque);
        
        System.out.println(primeiro);
        System.out.println(ultimo);
        
        deque.add(primeiro);
        deque.add(ultimo);

        System.out.println(deque);
    }
}
