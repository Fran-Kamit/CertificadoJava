import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileInputStream flujo = null;

        try {
            flujo = new FileInputStream("C:\\Users\\JAVA\\Desktop\\ActividadPropuesta10_06\\Enteros.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        Scanner sc = new Scanner(flujo);
        int contador = 0;
        int suma = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(n + " ");
            suma += n;
            contador++;
        }
        double media = (double) suma / contador;
        System.out.println("\nsuma = " + suma + "  media = " + media);
        sc.close();
    }
}