import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome pelo índice");
            System.out.println("3 - Acessar nome pelo índice");
            System.out.println("4 - Inserir nome em um índice");
            System.out.println("5 - Listar nomes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome: ");
                        String nome = scanner.nextLine();

                        nomes.add(nome);
                        System.out.println("Nome adicionado!");
                        break;

                    case 2:
                        System.out.print("Digite o índice para remover: ");
                        int indiceRemover =
                                Integer.parseInt(scanner.nextLine());

                        nomes.remove(indiceRemover);
                        System.out.println("Nome removido!");
                        break;

                    case 3:
                        System.out.print("Digite o índice para acessar: ");
                        int indiceAcessar =
                                Integer.parseInt(scanner.nextLine());

                        System.out.println(
                                "Nome: " + nomes.get(indiceAcessar)
                        );
                        break;

                    case 4:
                        System.out.print("Digite o índice para inserir: ");
                        int indiceInserir =
                                Integer.parseInt(scanner.nextLine());

                        System.out.print("Digite o nome: ");
                        String novoNome = scanner.nextLine();

                        nomes.add(indiceInserir, novoNome);
                        System.out.println("Nome inserido!");
                        break;

                    case 5:
                        System.out.println("Lista: " + nomes);
                        break;

                    case 0:
                        System.out.println("Programa encerrado!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro válido!");

            } catch (IndexOutOfBoundsException e) {
                System.out.println(
                        "Erro: índice inválido para a lista!"
                );
            }
        }
    }
}
