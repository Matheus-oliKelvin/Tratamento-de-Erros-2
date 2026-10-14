import java.util.Scanner;

public class Q13 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Acessar elemento");
            System.out.println("2 - Alterar elemento");
            System.out.println("3 - Exibir matriz");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a linha: ");
                        int linha = Integer.parseInt(scanner.nextLine());

                        System.out.print("Digite a coluna: ");
                        int coluna = Integer.parseInt(scanner.nextLine());

                        System.out.println(
                                "Valor: " + matriz[linha][coluna]
                        );
                        break;

                    case 2:
                        System.out.print("Digite a linha: ");
                        linha = Integer.parseInt(scanner.nextLine());

                        System.out.print("Digite a coluna: ");
                        coluna = Integer.parseInt(scanner.nextLine());

                        System.out.print("Digite o novo valor: ");
                        int valor = Integer.parseInt(scanner.nextLine());

                        matriz[linha][coluna] = valor;

                        System.out.println("Elemento alterado!");
                        break;

                    case 3:
                        for (int[] linhas : matriz) {
                            for (int elemento : linhas) {
                                System.out.print(elemento + " ");
                            }
                            System.out.println();
                        }
                        break;

                    case 0:
                        System.out.println("Programa encerrado!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro!");

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(
                        "Erro: linha ou coluna inexistente!"
                );
            }
        }


    }
}
