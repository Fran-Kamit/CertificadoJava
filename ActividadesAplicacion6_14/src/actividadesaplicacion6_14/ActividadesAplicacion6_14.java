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
        System.out.println(" Dise�a una aplicaci�n que se comporta como una "
                + "peque�a agenda. Mediante un men� el usuario\npodr� elegir "
                + "entre: \n1) A�adir un nuevo contacto (nombre y tel�fono)."
                + "\n2) Buscar el tel�fono de un contacto a partir de su nombre."
                + "\n3) Mostrar la informaci�n de todos los contactos ordenados "
                + "alfab�ticamente mediante el nombre.\n");

        Scanner sc = new Scanner(System.in);
        int eleccion;
        String[][] agenda = new String[0][0];

        do {
            System.out.print("Agenda vac�a. "
                    + "�Desea a�adir un contacto? 1- S�, 2- No: ");
            eleccion = sc.nextInt();
        } while (eleccion < 1 || eleccion > 2);

        if (eleccion == 1) {

            do {
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("\nA�adir nombre y tel�fono.");
                        int x = agenda.length;
                        agenda = Arrays.copyOf(agenda, agenda.length + 1);
                        agenda[x] = new String[2];
                        agenda = agregarNombreTel(agenda);
                        System.out.println("El contacto se ha a�adido correctamente.");
                    }

                    case 2 -> {
                        System.out.println("\nBuscar tel�fono a partir de nombre.");
                        buscarAgenda(agenda);
                    }

                    case 3 -> {
                        System.out.println("\nMostrando la informaci�n de la agenda.");
                        agenda = ordenarAgenda(agenda);
                        mostrarAgenda(agenda);
                    }
                }

                do {
                    System.out.print("\n�Qu� desea realizar? 1- A�adir, 2- Buscar, "
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
        /*Transformamos el nombre, la primera en may�scula y el resto en min�sculas.*/
        n1 = agenda[x][y].substring(0, 1) .toUpperCase();
        n2 = agenda[x][y].substring(1, agenda[x][y].length()) .toLowerCase();
        agenda[x][y] = n1 + n2;
        
        y++;
        System.out.print("Introduzca el tel�fono: ");
        String telefono = sc.next();

        while (telefono.length() != 9) {
            System.out.print("Error. Introduzca un tel�fono v�lido: ");
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
        /*Transformamos el nombre, la primera en may�scula y el resto en min�sculas.*/
        n1 = nombre.substring(0,1) .toUpperCase();
        n2 = nombre.substring(1, nombre.length()) .toLowerCase();
        nombre = n1 + n2;

        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i][0].equals(nombre)) {
                pos = i;
            }
        }

        if (pos > -1) {
            System.out.println(agenda[pos][0] + " tiene el n�mero " + agenda[pos][1]);
        } else {
            System.out.println("No hay ning�n contacto que se llame " + nombre);
        }
    }

    static String[][] ordenarAgenda(String agenda[][]) {
        int x = agenda.length;
        String auxNombre, auxTel;
        for (int i = 0; i < x - 1; i++) { //"x-1" Por el length de la agenda
            for (int j = i + 1; j < x; j++) {
                if (agenda[i][0].compareToIgnoreCase(agenda[j][0]) > 0) { //Compara ignorando may�sculas de los nombres
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