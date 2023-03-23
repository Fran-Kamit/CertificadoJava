//import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calendario fecha = new Calendario(0, 0, 0);
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo, eleccion;

        System.out.println(" Ingrese la fecha.");
        
        /*Introducimos y validamos "día"*/
        System.out.print(" Ingrese el día: ");
        dia = sc.nextInt();

        while (dia < 1 || dia > 31) {
            System.out.print(" Ingrese un día válido: ");
            dia = sc.nextInt();
        }
        fecha.dia = dia;

        /*Introducimos y validamos "mes"*/
        System.out.print(" Ingrese el mes: ");
        mes = sc.nextInt();

        while (mes < 1 || mes > 12){
            System.out.print(" Ingrese un mes válido: ");
            mes = sc.nextInt();
        }  
        fecha.mes = mes;

        /*Introducimos y validamos "año"*/
        System.out.print(" Ingrese el año: ");
        anyo = sc.nextInt();

        while (anyo == 0){
            System.out.print(" El año 0 no es un año válido. Introduzca otro: ");
            anyo = sc.nextInt();
        }
        fecha.anyo = anyo;
        
        System.out.println(" ¿Qué desea realizar?");
        System.out.print(" 1- Incrementar día, 2- Incrementar mes, 3- Incrementar año,\n4- Comprobar si es igual a otra fecha: ");
        eleccion = sc.nextInt();
        
        while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4) {
            System.out.print(" Ingrese una elección válida: ");
            eleccion = sc.nextInt();
        }

        do {
            do{
                /*switch (eleccion) {
                    case 1 ->
                        fecha.incrementarDia();

                    case 2 ->
                        fecha.incrementarMes();

                    case 3 ->
                        fecha.incrementarAño();

                    case 4 -> {
                        if (fecha.esIgual(new Calendario(0, 0, 0))) {
                            System.out.println(" ¡La fecha es igual!");
                        } else {
                            System.out.println(" ¡La fecha es diferente!");
                        }
                    }
                        
                }*/
                System.out.println("¿Qué desea realizar? 1- Incrementar día, 2- Incrementar mes, 3- Incrementar año,\n4- Comprobar si es igual a otra fecha, 0 - salir");
                eleccion = sc.nextInt();

            } while (eleccion < 0 || eleccion > 4);

        } while (eleccion >= 1 && eleccion <= 4);
        
        fecha.mostrar(); sc.close();
    }
}