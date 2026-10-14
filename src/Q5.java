public class Q5 {
    static void main() {
        String[] palavras = {"java", "python", null, "html", "css"};

        for (int i = 0; i < palavras.length; i++) {
            try {
                palavras[i] = palavras[i].toUpperCase();
                System.out.println(palavras[i]);

            } catch (NullPointerException e) {
                System.out.println("Erro: elemento " + i + " é null!");
            }
        }
    }
}
