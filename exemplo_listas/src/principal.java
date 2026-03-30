import java.util.Scanner;

// exemplo de TRY/CATCH utilizado:
// try {
    
// } catch (NumberFormatException e) {
//     System.out.println("[ERRO] Você digitou um caractere inválido.");
//     continue;
// }

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Pilha minhaPilha = null;
        Fila minhaFila = null;

        boolean loop = true;

        while (loop) {
            System.out.println("\n--- Menu de opções ---");
            System.out.println(" 1. Pilha");
            System.out.println(" 2. Fila");
            System.out.println(" 3. Lista encadeada");
            System.out.println(" 4. DEQUE");
            System.out.println(" 5. Sair");
            System.out.print("\nDigite sua opção: ");
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
                        System.out.println(" 1. Criar Pilha");
                        System.out.println(" 2. Adicionar item");
                        System.out.println(" 3. Mostrar pilha");
                        System.out.println(" 4. Remover item");
                        System.out.print("\n Digite sua opção: ");
                        entrada = leitor.nextLine();

                        try {
                            int opcaoPilha = Integer.parseInt(entrada);

                            switch (opcaoPilha) {
                                case 1: //Criação de Pilha
                                    System.out.println("Digite o tamanho da PILHA que deseja:");
                                    System.out.print("--> ");
                                    entrada = leitor.nextLine();
                                    try {
                                        int tamanhoPilha = Integer.parseInt(entrada);
                                        minhaPilha = new Pilha(tamanhoPilha);
                                        System.out.println("\n");
                                        System.out.printf("Sua pilha foi criada com %d espaços", tamanhoPilha);
                                        
                                    } catch (NumberFormatException e) {
                                        System.out.println("[ERRO] Você digitou um caractere inválido.");
                                        continue;
                                    }
                                    break;
                                case 2: //Adicionar valores na pilha
                                    if (minhaPilha == null) {
                                        System.out.println("[ERRO] Você precisa criar a lista antes de adicionar valores a ela.");
                                    } else {
                                        System.out.println("Digite o que deseja inserir na pilha:");
                                        entrada = leitor.nextLine();
                                        int valorTamanho = Integer.parseInt(entrada);
                                        minhaPilha.empilhar(valorTamanho);
                                    }
                                    break;

                                case 3: // Exibir a pilha
                                    if (minhaPilha == null) {
                                        System.out.println("[ERRO] Você precisa criar a lista antes de exibi-la.");
                                    } else {
                                        System.out.println("-----------");
                                        minhaPilha.exibirPilha();
                                    }
                                    break;
                                
                                case 4: // Remover ultimo valor da pilha
                                    if (minhaPilha == null) {
                                        System.out.println("[ERRO] Para remover você tem que CRIAR a pilha");
                                    } else if (minhaPilha.estaVazia()) {
                                        System.out.println("[ERRO] A pilha existe, mas não tem nada para remover.");
                                        System.out.println("ADICIONE valores para poder remover");
                                    } else {
                                        System.out.println("Estamos removendo o último item adicionado.");
                                        int valorRemovido = minhaPilha.desempilhar();
                                        System.out.printf("Valor removido: %d", valorRemovido);
                                    }
                                    break;
                            
                                default:
                                    System.out.println("[ERRO] Opção inválida.");
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("[ERRO] Você digitou um caractere inválido.");
                            continue;
                        }
                        break;
                        
                        case 2: //Fila
                            System.out.println("\n----- Menu de Fila -----");
                            System.out.println(" 1. Criar Fila");
                            System.out.println(" 2. Adicionar item");
                            System.out.println(" 3. Mostrar Fila");
                            System.out.println(" 4. Remover item");
                            System.out.print("\n Digite sua opção: ");
                            entrada = leitor.nextLine();

                            try {
                                int opcaoFila = Integer.parseInt(entrada);

                                switch (opcaoFila) {
                                    case 1: // Criar Fila
                                        System.out.println("\nDigite o tamanho que deseja da lista:");
                                        System.out.print("---> ");
                                        entrada = leitor.nextLine();
                                        try {
                                            int tamanhoFila = Integer.parseInt(entrada);

                                            minhaFila = new Fila(tamanhoFila);
                                            System.out.printf("Sua fila com %d espaços foi criado", tamanhoFila);

                                        } catch (NumberFormatException e) {
                                            System.out.println("[ERRO] Você digitou um caractere inválido.");
                                        }
                                        break;
                                    case 2: // Adicionar item
                                        System.out.println("Digite o valor que deseja inserir:");
                                        System.out.print("---> ");
                                        entrada = leitor.nextLine();
                                        try {
                                            int valorFila = Integer.parseInt(entrada);

                                            minhaFila.enfileirar(valorFila);
                                            System.out.printf("\nO valor %d foi inserido na lista.", valorFila);
                                        } catch (NumberFormatException e) {
                                            System.out.println("Valor inserido inválido.");
                                        }
                                        break;
                                    case 3: // Mostrar Fila
                                        minhaFila.mostrarFila();
                                        break;
                                    case 4: // Remover item
                                        minhaFila.desenfileirar();
                                        break;
                                    default:
                                        System.out.println("Opção inválida, escolha novamente.");
                                        break;
                                }

                            } catch (NumberFormatException e) {
                                System.out.println("[ERRO] Você digitou um caractere inválido.");
                                continue;
                            }
                            break;
                        case 3: // Lista encadeada
                            System.out.println("[Aguarde] ainda está em construção");
                            break;
                        case 4: // DEQUE
                            System.out.println("[Aguarde] ainda está em construção");
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
