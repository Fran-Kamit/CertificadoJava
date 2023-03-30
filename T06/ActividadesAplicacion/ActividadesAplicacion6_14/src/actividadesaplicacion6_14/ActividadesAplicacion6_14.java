/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesaplicacion6_14;
import java.util.*;
/**
 *
 * @author Administrador
 */
public class ActividadesAplicacion6_14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Diseña una aplicación que se comporta como una "
                + "pequeña agenda. Mediante un menú el usuario\npodrá elegir "
                + "entre: \n1) Añadir un nuevo contacto (nombre y teléfono)."
                + "\n2) Buscar el teléfono de un contacto a partir de su nombre."
                + "\n3) Mostrar la información de todos los contactos ordenados "
                + "alfabéticamente mediante el nombre.\n");

        Scanner sc = new Scanner(System.in);
        int eleccion;
        String[][] agenda = new String[0][0];

        do {
            System.out.print("Agenda vacía. "
                    + "¿Desea añadir un contacto? 1- Sí, 2- No: ");
            eleccion = sc.nextInt();
        } while (eleccion < 1 || eleccion > 2);

        if (eleccion == 1) {

            do {
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("\nAñadir nombre y teléfono.");
                        int x = agenda.length;
                        agenda = Arrays.copyOf(agenda, agenda.length + 1);
                        agenda[x] = new String[2];
                        agenda = agregarNombreTel(agenda);
                        System.out.println("El contacto se ha añadido correctamente.");
                    }

                    case 2 -> {
                        System.out.println("\nBuscar teléfono a partir de nombre.");
                        buscarAgenda(agenda);
                    }

                    case 3 -> {
                        System.out.println("\nMostrando la información de la agenda.");
                        agenda = ordenarAgenda(agenda);
                        mostrarAgenda(agenda);
                    }
                }

                do {
                    System.out.print("\n¿Qué desea realizar? 1- Añadir, 2- Buscar, "
                            + "3- Mostrar, 0- Salir: ");
                    eleccion = sc.nextInt();
                } while (eleccion < 0 || eleccion > 3);
            } while (eleccion >= 1 && eleccion <= 3);
        }
        System.out.println("\nSaliendo del programa...");
    }

    static String[][] agregarNombreTel(String agenda[][]) {
        Scanner sc = new Scanner(System.in);
        String n1, n2;

        /*Eje X*/
        int x = agenda.length - 1;

        /*Eje Y*/
        int y = 0;
        System.out.print("Introduzca el nombre: ");
        agenda[x][y] = sc.nextLine();
        /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
        n1 = agenda[x][y].substring(0, 1) .toUpperCase();
        n2 = agenda[x][y].substring(1, agenda[x][y].length()) .toLowerCase();
        agenda[x][y] = n1 + n2;
        
        y++;
        System.out.print("Introduzca el teléfono: ");
        String telefono = sc.next();

        while (telefono.length() != 9) {
            System.out.print("Error. Introduzca un teléfono válido: ");
            telefono = sc.next();
        }
        agenda[x][y] = telefono;

        return agenda;
    }

    static void buscarAgenda(String agenda[][]) {
        Scanner sc = new Scanner(System.in);
        String nombre, n1, n2;
        int pos = -1;

        System.out.print("Introduzca el nombre: ");
        nombre = sc.nextLine();
        /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
        n1 = nombre.substring(0,1) .toUpperCase();
        n2 = nombre.substring(1, nombre.length()) .toLowerCase();
        nombre = n1 + n2;

        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i][0].equals(nombre)) {
                pos = i;
            }
        }

        if (pos > -1) {
            System.out.println(agenda[pos][0] + " tiene el número " + agenda[pos][1]);
        } else {
            System.out.println("No hay ningún contacto que se llame " + nombre);
        }
    }

    static String[][] ordenarAgenda(String agenda[][]) {
        int x = agenda.length;
        String auxNombre, auxTel;
        for (int i = 0; i < x - 1; i++) { //"x-1" Por el length de la agenda
            for (int j = i + 1; j < x; j++) {
                if (agenda[i][0].compareToIgnoreCase(agenda[j][0]) > 0) { //Compara ignorando mayúsculas de los nombres
                    auxNombre = agenda[j][0];
                    auxTel = agenda[j][1];
                    agenda[j][0] = agenda[i][0];
                    agenda[j][1] = agenda[i][1];
                    agenda[i][0] = auxNombre;
                    agenda[i][1] = auxTel;
                }
            }
        }
        return agenda;
    }

    static void mostrarAgenda(String agenda[][]) {
        for (String[] agenda1 : agenda) {
            System.out.println(Arrays.toString(agenda1));
        }
    }
}