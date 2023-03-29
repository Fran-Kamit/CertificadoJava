import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int segundos;
        Scanner sc = new Scanner(System.in);

        HoraExacta r = new HoraExacta (11, 15, 23);
        System.out.println(r);
        
        for (int i = 1; i <=60; i++) {
            r.incrementar();
        }
        System.out.println(r);

        do {
            System.out.print("Escriba los segundos: ");
            segundos = sc.nextInt();

        } while (segundos < 0 || segundos > 59);

        if (r.setSegundos(segundos)) {
            System.out.println(r);
        }
        sc.close();
    }
}