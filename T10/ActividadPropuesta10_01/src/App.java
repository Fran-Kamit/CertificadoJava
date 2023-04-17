import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Integer resultado;
        while (true) {
            try {
                System.out.print("Introducir número entero: ");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Tipo erróneo");
            }
        }
        System.out.println(resultado);
        //sc.close();
    }
}