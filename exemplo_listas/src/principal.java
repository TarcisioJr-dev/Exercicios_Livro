import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Menu de opções ---");
            System.out.println(" 1. Pilha");
            System.out.println(" 2. Fila");
            System.out.println(" 3. Lista encadeada");
            System.out.println(" 4. DEQUE");
            System.out.println(" 5. Sair");

            String entrada = leitor.nextLine();
            try {
                int opcao = Integer.parseInt(entrada); // Tenta converter o texto em número
                
                if (opcao < 1 || opcao > 5) {
                    
                    System.out.println("[ERRO] Opção Inválida, escolha novamente.");
                    continue;
                    
                } else {
                    switch (opcao) {
                        case 1: // Opções de Pilha
                        System.out.println("\n--- Opções de Pilha ---");
                        System.out.println(" 1. Adicionar item");
                        System.out.println(" 2. Mostrar pilha");
                        System.out.println(" 3. Remover item");
                        break;
                        
                        case 5: // Sair
                        System.out.println("Obrigado por utilizar este programa.");
                        loop = false;
                        
                        default:
                            break;
                        }
                }
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Você digitou um caractere inválido.");
                continue;
            }
        }

        leitor.close();
    }
}
