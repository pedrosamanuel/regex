import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EJ2 {
    public static void main(String[] args) throws IOException {
        String archivo = args[0];
        String expresionRegular = args[1];
        final Pattern patron = Pattern.compile(expresionRegular);

        coincidencia(archivo,patron);

    }
    public static void coincidencia(String archivo, Pattern patron) throws IOException {
        for (String linea : Files.readAllLines(Paths.get(archivo))){
            final Matcher matcher = patron.matcher(linea);

            while (matcher.find()){
                System.out.println("Grupo entero: " + matcher.group(0));

                for (int i = 1; i<=matcher.groupCount();i++){
                    System.out.println("Grupo " + i + ": " + matcher.group(i));
                }
            }
        }
    }

}
