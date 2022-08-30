import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        for(;;){

            System.out.println("Bem-vindo ao sistemas de trem!");
            System.out.println("1. Criar trem");
            System.out.println("2. Editar trem");
            System.out.println("3. Listar trens");
            System.out.println("4. Desfazer trem");
            System.out.println("5. Sair");
            System.out.print("Por favor, selecione a opção desejada:");
            int opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("Digite o identificador do trem: ");
                int identificadorTrem = sc.nextInt();
                System.out.println("Digite o identificador da primeira locomotiva: ");
                int identificadorLocomotiva = sc.nextInt();

                //Fazer método que puxe a locomotiva de sua classe e adicione em um trem.

                //Esta operação exige que se indique o identificador do trem e a primeira locomotiva.
                // A primeira locomotiva nunca pode ser removida. Para liberar esta locomotiva é necessário desfazer o trem.
            continue;
            }
            if(opcao == 2){
                //Inicialmente deve-se indicar o identificador do trem a ser editado. A partir de então ficam liberadas as seguintes operações:
                System.out.println("Digite o identificador do trem: ");
                int identificadorTrem = sc.nextInt();

                    for(;;){
                        System.out.println("Menu de edição de trem.");
                    System.out.println("1. Inserir uma locomotiva.");
                    System.out.println("2. Inserir um vagão.");
                    System.out.println("3. Remover o último elemento do trem.");
                    System.out.println("4. Listar locomotivas livres.");
                    System.out.println("5. Listar vagões livres.");
                    System.out.println("6. Encerrar edição do trem");
                    System.out.print("Selecione a opção desejada: ");
                    int opcao1 = sc.nextInt();
                    if(opcao1 == 1){
                    //· Inserir uma locomotiva (informar identificador) respeitando restrições
                        continue;
                    }
                    if(opcao1 == 2){
                    //· Inserir um vagão (informar identificador) respeitando restrições
                        continue;
                    }
                    if(opcao1 == 3){
                    //· Remover o último elemento do trem
                        continue;
                    }
                    if(opcao1 == 4){
                    //· Listar locomotivas livres
                        continue;
                    }
                    if(opcao1 == 5){
                    //· Listar vagões livres
                        continue;
                    }
                    if(opcao1 == 6){
                    //· Encerrar a edição do trem
                        System.out.println("Voltando ao menu principal...");
                        break;
                    } 
                }   
                continue;
            }
            if(opcao == 3){
                //Listar todas os trens já criados (todos os trens que estão no pátio)
                continue;
            }
            if(opcao == 4){
                System.out.println("Digite o identificador do trem: ");
                int identificadorTrem = sc.nextInt();
                //· Deve-se indicar o identificador do trem. A partir de então todos seus vagões e locomotivas devem ser liberados e o trem excluído da lista de trens.
                continue;
            }
            if(opcao == 5){
                //sair...
                System.out.println("Saindo...");
                break;
            }

            
            
        }
    }
}
