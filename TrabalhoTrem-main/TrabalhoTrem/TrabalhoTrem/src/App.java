import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Bem-vindo ao sistemas de trem!");
            System.out.println("1. Criar trem");
            System.out.println("2. Editar trem");
            System.out.println("3. Listar trens");
            System.out.println("4. Desfazer trem");
            System.out.println("5. Sair");
            System.out.print("Por favor, selecione a opção desejada:");
            int opcao = sc.nextInt();
           switch(opcao){

            case 1: 
                System.out.println("Digite um identificador para o  trem: ");
                int identificadorTrem = sc.nextInt();
                System.out.println("Digite um identificador para a  locomotiva: ");
                int identificadorLocomotiva = sc.nextInt();
                
                //Fazer método que puxe a locomotiva de sua classe e adicione em um trem.

                //Esta operação exige que se indique o identificador do trem e a primeira locomotiva.
                // A primeira locomotiva nunca pode ser removida. Para liberar esta locomotiva é necessário desfazer o trem.
                continue;
            case 2:
                //Inicialmente deve-se indicar o identificador do trem a ser editado. A partir de então ficam liberadas as seguintes operações:
                System.out.println("Digite o identificador do trem: ");
                //int identificadorTrem = sc.nextInt();

                while(true){
                    System.out.println("Menu de edição de trem.");
                    System.out.println("1. Inserir uma locomotiva.");
                    System.out.println("2. Inserir um vagão.");
                    System.out.println("3. Remover o último elemento do trem.");
                    System.out.println("4. Listar locomotivas livres.");
                    System.out.println("5. Listar vagões livres.");
                    System.out.println("6. Encerrar edição do trem");
                    System.out.print("Selecione a opção desejada: ");
                    int opcao1 = sc.nextInt();

                    switch(opcao1){
                        case 1: 
                        //· Inserir uma locomotiva (informar identificador) respeitando restrições
                        continue;

                        case 2:
                        //· Inserir um vagão (informar identificador) respeitando restrições
                        continue;

                        case 3: 
                        //· Remover o último elemento do trem
                        continue;
                        
                        case 4:
                        //· Listar locomotivas livres
                        continue;

                        case 5:
                        //· Listar vagões livres
                        continue;

                        case 6:
                        //· Encerrar a edição do trem
                        System.out.println("Voltando ao menu principal...");
                        
                    }break;
                }

            case 3:
                //Listar todas os trens já criados (todos os trens que estão no pátio)
                continue;
            
            case 4:
                System.out.println("Digite o identificador do trem: ");
                //int identificadorTrem = sc.nextInt();
                //· Deve-se indicar o identificador do trem. A partir1 de então todos seus vagões e locomotivas devem ser liberados e o trem excluído da lista de trens.
                continue;
            
            case 5: 
                //sair...
                System.out.println("Saindo...");
                

       
            }break;
   
        }
    }
}