public class Q7 {
    static void main() {

        String[] valores = {"10.5", "20.7", "abc", "35.2", "oi"};

        for (int i = 0; i < valores.length; i++) {
            try {
                double numero = Double.parseDouble(valores[i]);
                System.out.println("Número convertido: " + numero);

            } catch (NumberFormatException e) {
                System.out.println("Erro: '" + valores[i] + "' não pode ser convertido.");
            }
        }


    }
}
