import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int eleccion;
        MarcaPagina marca = new MarcaPagina();

        System.out.println("\n ¿Qué desea realizar?");
        System.out.print(" 1- Incrementar página, 2- Mostrar última página leída, 3- Empezar libro: ");
        eleccion = sc.nextInt();

        while (eleccion < 1 || eleccion > 3) {
            System.out.print(" Introduzca una elección válida: ");
            eleccion = sc.nextInt();
        }

        do {
            do {
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("Incrementando en una página...");
                        marca.incrementarPagina();
                    }
                    case 2 ->
                        System.out.println("La última página leída es: " + marca.ultimaPaginaLeida());
                    case 3 -> {
                        System.out.println("Empezando libro...");
                        marca.comenzar();
                    }
                }
                System.out.println("\n ¿Qué desea realizar?");
                System.out.print(" 1- Incrementar página, 2- Mostrar última página leída, 3- Empezar libro, 0- Salir: ");
                eleccion = sc.nextInt();

            } while (eleccion < 0 || eleccion > 3);
        } while (eleccion >= 1 && eleccion <= 3);
        System.out.println("\n Saliendo del programa...");
        sc.close();
    }
}