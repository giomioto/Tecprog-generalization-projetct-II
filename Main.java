import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Colaborador> colaboradores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Sexo: ");
                char sexo = scanner.nextLine().charAt(0);
                System.out.print("Dia de nascimento: ");
                int dia = scanner.nextInt();
                System.out.print("Mês de nascimento: ");
                int mes = scanner.nextInt();
                System.out.print("Ano de nascimento: ");
                int ano = scanner.nextInt();
                System.out.print("Faltas no mês: ");
                int faltasMes = scanner.nextInt();
                System.out.print("Salário: ");
                double salario = scanner.nextDouble();
                Data dtNasc = new Data(dia, mes, ano);
                Colaborador colaborador = new Colaborador(nome, sexo, dtNasc, faltasMes, salario);
                colaboradores.add(colaborador);
            } else if (opcao == 2) {
                if (colaboradores.isEmpty()) {
                    System.out.println("Nenhum colaborador cadastrado!");
                }
                System.out.println("\n--------------------\n");
                for (Colaborador colaborador : colaboradores) {
                    System.out.println(colaborador);}
                System.out.println("\n--------------------");
            }
            else if (opcao == 3) {
                System.out.println("Saindo...");
                scanner.close();
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
