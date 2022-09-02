import java.util.Scanner;
public class App {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GaragemLocomotivas garagemLocomotiva = new GaragemLocomotivas();
        PatioTrens patio = new PatioTrens();
        Locomotiva um = new Locomotiva(1);
        Locomotiva dois = new Locomotiva(2);
        Locomotiva tres = new Locomotiva(3);
        Locomotiva quatro = new Locomotiva(4);
        Locomotiva cinco = new Locomotiva(5);
        Locomotiva seis = new Locomotiva(6);

        garagemLocomotiva.locomotivaEntra(um);
        garagemLocomotiva.locomotivaEntra(dois);
        garagemLocomotiva.locomotivaEntra(tres);
        garagemLocomotiva.locomotivaEntra(quatro);
        garagemLocomotiva.locomotivaEntra(cinco);
        garagemLocomotiva.locomotivaEntra(seis);

        boolean verificador = true;

        while(verificador){
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
                System.out.println("Escolha uma das locomotivas abaixo para engatar no Trem: ");
                System.out.println(garagemLocomotiva.toString());
                System.out.println("Digite um identificador para o  trem: ");
                int identificadorTrem = sc.nextInt();

                if(patio.verificaTrem(identificadorTrem) == true){
                    System.out.println("Já existe um trem com esse identificador!!\n");
                    continue;
                }

                System.out.println("Digite um identificador para a  locomotiva: ");
                int identificadorLocomotiva = sc.nextInt();
                

                Locomotiva aux = garagemLocomotiva.procurLocomotiva(identificadorLocomotiva);
                patio.tremEntra(criaTrem(identificadorLocomotiva, aux));

                System.out.println(criaTrem(identificadorTrem, aux));
                System.out.println(patio.toString());

                
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
                            System.out.println("Patio:\n" + patio.toString());
                            System.out.println("Escolha um dos Trens estacionados no patio: ");
                            int idTrem = sc.nextInt();
                            System.out.println("Garagem das Locomotivas:\n" + garagemLocomotiva.toString());
                            System.out.println("Escolha uma das locomotivas: ");
                            int idLoc = sc.nextInt();

                            patio.procuraTrem(idTrem).engataLocomotiva(patio.procuraTrem(idTrem), garagemLocomotiva.procurLocomotiva(idLoc));
                            
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
                System.out.println(patio.toString());
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

    
    public static Trem criaTrem(int id, Locomotiva locomotiva){
        
        Trem trem = new Trem(id, locomotiva);
        return trem;
    }
    
}