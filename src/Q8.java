import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro ou 'sair': ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa encerrado!");
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                System.out.println("Número digitado: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro: digite um número inteiro válido!");
            }
        }


    }
}
