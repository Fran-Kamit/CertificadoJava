import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        String texto = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Desktop\\ActividadPropuesta10_01\\App.java"));
            String c = in.readLine();
            while (c != null) {
                texto = texto + c + '\n';
                c = in.readLine();
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