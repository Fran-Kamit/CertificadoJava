import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Desktop\\ActividadPropuesta10_04\\NumerosReales.txt"));
            String texto = in.readLine();
            String[] subcadenas = texto.split(" ");
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);
            }
            System.out.println("suma: " + suma + "\tmedia: " + suma / subcadenas.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}