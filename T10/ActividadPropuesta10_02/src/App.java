import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        FileReader in = null;
        try {
            in = new FileReader("C:\\Users\\JAVA\\Desktop\\ActividadPropuesta10_01\\App.java");
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
