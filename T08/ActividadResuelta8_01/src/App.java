import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int hora;
        boolean cambio;
        Scanner sc = new Scanner(System.in);

        Hora r = new Hora(11, 30);
        System.out.println(r);
        for (int i = 1; i < 61; i++) {
            r.incrementar();
        }
        System.out.println(r);

        do{
            System.out.print("Escriba una hora: ");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);
    
        cambio = r.setHora(hora);

        if (cambio) {
        System.out.println(r);
        } else {
        System.out.println("La hora no se pudo cambiar.");
        }

        sc.close();
    }
}