import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q10 {
    static void main() {
        String texto = "31/12/2026";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        try {
            Date data = formato.parse(texto);
            System.out.println("Data convertida: " + data);

        } catch (ParseException e) {
            System.out.println("Erro: formato de data inválido!");
        }
    }
}

