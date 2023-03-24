
//import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo, eleccion;

        do {
            System.out.println("\n Introduzca la fecha.");

            /* Introducimos y validamos "día" */
            System.out.print(" Introduzca el día: ");
            dia = sc.nextInt();

            while (dia < 1 || dia > 31) {
                System.out.print(" Introduzca un día válido: ");
                dia = sc.nextInt();
            }

            /* Introducimos y validamos "mes" */
            System.out.print(" Introduzca el mes: ");
            mes = sc.nextInt();

            while (mes < 1 || mes > 12) {
                System.out.print(" Introduzca un mes válido: ");
                mes = sc.nextInt();
            }

            /* Introducimos y validamos "año" */
            System.out.print(" Introduzca el año: ");
            anyo = sc.nextInt();

            while (anyo == 0) {
                System.out.print(" El año 0 no es un año válido. Introduzca otro: ");
                anyo = sc.nextInt();
            }
            /*Validamos fecha*/
        } while ((dia > 28 && mes == 2 && anyo % 4 != 0) || (dia > 29 && mes == 2 && anyo % 4 == 0) || (dia > 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)));

        Calendario fecha = new Calendario(dia, mes, anyo); // Clase y constructor

        System.out.println("\n ¿Qué desea realizar?");
        System.out.print(" 1- Incrementar día, 2- Incrementar mes, 3- Incrementar año,\n4- Comprobar si es igual a otra fecha, 5- Mostrar fecha: ");
        eleccion = sc.nextInt();

        while (eleccion < 1 || eleccion > 5) {
            System.out.print(" Introduzca una elección válida: ");
            eleccion = sc.nextInt();
        }

        do {
            do {
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("\n Incrementando un día...");
                        fecha.incrementarDia();
                    }

                    case 2 -> {
                        System.out.println("\n Incrementando un mes...");
                        fecha.incrementarMes();
                    }

                    case 3 -> {
                        int increAnyo;
                        System.out.print("\n ¿Cuántos años desea incrementar? ");
                        increAnyo = sc.nextInt();
                        fecha.incrementarAnyo(increAnyo);
                    }

                    case 4 -> {
                        int compDia, compMes, compAnyo;
                        System.out.println("\n Introduzca la fecha.");

                        /* Introducimos y validamos "día" */
                        System.out.print(" Introduzca el día: ");
                        compDia = sc.nextInt();

                        while (compDia < 1 || compDia > 31) {
                            System.out.print(" Introduzca un día válido: ");
                            compDia = sc.nextInt();
                        }

                        /* Introducimos y validamos "mes" */
                        System.out.print(" Introduzca el mes: ");
                        compMes = sc.nextInt();

                        while (compMes < 1 || compMes > 12) {
                            System.out.print(" Introduzca un mes válido: ");
                            compMes = sc.nextInt();
                        }

                        /* Introducimos y validamos "año" */
                        System.out.print(" Introduzca el año: ");
                        compAnyo = sc.nextInt();

                        while (compAnyo == 0) {
                            System.out.print(" El año 0 no es un año válido. Introduzca otro: ");
                            compAnyo = sc.nextInt();
                        }
                        fecha.iguales(compDia, compMes, compAnyo);
                        System.out.println("\n ¿Las fechas son iguales? " + fecha.comprueba());

                    }
                    case 5 -> {
                        System.out.print("\n La fecha es: ");
                        fecha.mostrar();
                    }
                }

                System.out.println("\n ¿Qué desea realizar?");
                System.out.println(" 1- Incrementar día, 2- Incrementar mes, 3- Incrementar año,\n4- Comprobar si es igual a otra fecha, 5- Mostrar fecha, 0- Salir");
                eleccion = sc.nextInt();

            } while (eleccion < 0 || eleccion > 5);

        } while (eleccion >= 1 && eleccion <= 5);
        System.out.println("\n Cerrando del programa...");
        sc.close();
    }
}