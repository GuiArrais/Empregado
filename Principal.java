import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<>();

        int opcao = 0;
        while(opcao !=7) {
                System.out.println("Escolha uma opção:");
            System.out.println("""
                    [1] Criar novo empregado;
                    [2] Promover empregado;
                    [3] Aumentar salário do empregado;
                    [4] Demitir empregado;
                    [5] Fazer aniversário do empregado;
                    [6] Mostrar detalhes dos empregados;
                    [7] Sair;
                    """);
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Informe o nome, a idade e o salário do novo funcionário:");
                    System.out.print("Nome: ");
                    String nome = input.next();
                    System.out.print("Idade: ");
                    int idade = input.nextInt();
                    System.out.print("Salário: R$");
                    double salario = input.nextDouble();
                    empregados.add(new Empregado(nome, idade, salario));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o índice do empregado que vai ser promovido");
                    System.out.print("Índice: "); 
                    int indicePromover = input.nextInt();
                    empregados.get(indicePromover).promover();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o índice e o valor a ser aumentado no salário");
                    System.out.print("Índice: ");
                    int indiceAumentar = input.nextInt();
                    System.out.print("Valor: R$");
                    double percentualAumento = input.nextDouble();
                    empregados.get(indiceAumentar).aumentarSalario(percentualAumento);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe o índice e o motivo da demissão (1, 2 ou 3):");
                    System.out.print("Índice: ");
                    int indiceDemitir = input.nextInt();
                    System.out.println("""
                            Motivo:
                            [1] Justa causa;
                            [2] Decisão do empregador;
                            [3] Aposentadoria;
                            """);
                    int motivo = input.nextInt();
                    empregados.get(indiceDemitir).demitir(motivo);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Informe o índice do empregado que está fazendo aniversário:");
                    System.out.print("Índice: ");
                    int indiceAniversario = input.nextInt();
                    empregados.get(indiceAniversario).fazerAniversario();
                    System.out.println();
                    break;
                case 6:
                    for(int i=0; i<empregados.size(); i++) {
                        System.out.println("Empregado " + i + ": " + empregados.get(i));
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        input.close();
    }
}