import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("D:\\·Curso JAVA con framework spring\\1- Programación en JAVA\\T10\\ActividadPropuesta10_01\\src\\App.java");
            int c = in.read();
            while (c != -1) {
                texto = texto + (char) c;
                c = in.read();
            }
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
        System.out.println(texto);
    }
}