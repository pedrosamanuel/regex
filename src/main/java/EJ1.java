import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class EJ1 {
    public static void main(String[] args) throws IOException {
        String archivo = args[0];
        String expresionRegular = args[1];
        final Pattern patron = Pattern.compile(expresionRegular);

        coincidencia(archivo, patron);

    }

    public static void coincidencia(String archivo, Pattern patron) throws IOException {
        int n = 1;
        for (String linea : Files.readAllLines(Paths.get(archivo))) {

            if (patron.matcher(linea).matches()) {
                System.out.println(n + " si");
            } else {
                System.out.println(n + " no");
            }
            n++;
        }
    }

}

