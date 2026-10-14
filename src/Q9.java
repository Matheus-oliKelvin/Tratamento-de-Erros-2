import java.util.ArrayList;
import java.util.List;

public class Q9 {

        public static double calcularMedia(List<Double> numeros) {
            try {
                if (numeros == null || numeros.isEmpty()) {
                    throw new IllegalArgumentException("A lista está vazia ou é null!");
                }

                double soma = 0;

                for (Double numero : numeros) {
                    if (numero == null) {
                        throw new IllegalArgumentException("A lista contém um valor null!");
                    }

                    soma += numero;
                }

                return soma / numeros.size();

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                return 0;
            }
        }

        public static void main(String[] args) {
            List<Double> numeros = new ArrayList<>();

            numeros.add(10.0);
            numeros.add(20.0);
            numeros.add(30.0);

            double media = calcularMedia(numeros);

            System.out.println("Média: " + media);
        }
    }

