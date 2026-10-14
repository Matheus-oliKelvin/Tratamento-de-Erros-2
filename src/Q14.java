import java.util.Scanner;

public class Q14 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o telefone (9 dígitos): ");
            String telefone = scanner.nextLine();

            if (telefone.length() != 9) {
                throw new IllegalArgumentException(
                        "O telefone deve conter exatamente 9 dígitos!"
                );
            }

            for (int i = 0; i < telefone.length(); i++) {
                if (!Character.isDigit(telefone.charAt(i))) {
                    throw new IllegalArgumentException(
                            "O telefone não pode conter letras ou caracteres especiais!"
                    );
                }
            }

            System.out.println("Telefone válido!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }

    }
}
