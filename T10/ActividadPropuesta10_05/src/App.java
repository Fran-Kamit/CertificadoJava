import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Desktop\\ActividadPropuesta10_05\\Numeros.txt"));
            Scanner s;
            Double numero;
            Double suma = 0.0;
            String linea = in.readLine();

            while (linea != null) {
                s = new Scanner(linea) .useLocale(Locale.US);
                if (s.hasNextDouble()) {
                    numero = s.nextDouble();
                    suma += numero;
                }
                linea = in.readLine();
            }
            System.out.println("suma = " + suma);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}