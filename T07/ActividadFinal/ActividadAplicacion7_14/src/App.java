import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Crea una clase que sea capaz de mostrar el importe de un cambio " +
                "con el menor número de\nmonedas y billetes posibles.\n");

        Compra devolucion = new Compra();

        Scanner sc = new Scanner(System.in);
        int eleccion;
        double totalcompra, pago, cambio;

        do {
            do {
                System.out.print(" Introduzca el total de la compra: ");
                totalcompra = sc.nextDouble();

                System.out.print(" Introduzca el valor del pago: ");
                pago = sc.nextDouble();

                cambio = pago - totalcompra;

                if (cambio == 0) {
                    System.out.println(" El pago es justo.");
                } else if (cambio < 0) {
                    System.out.println(" Falta dinero para pagar.");
                } else {
                    System.out.println("\nEl cambio es: ");
                    devolucion.calcular(cambio);
                    devolucion.mostrarDevolucion();
                }
                System.out.print("\n ¿Desea calcular otro pago?\n1- Sí, 0- No.: ");
                eleccion = sc.nextInt();
                System.out.println("");
            } while (eleccion < 0 || eleccion > 1);
        } while (eleccion == 1);

        sc.close();
        System.out.println("\nSaliendo del programa...");
    }
}