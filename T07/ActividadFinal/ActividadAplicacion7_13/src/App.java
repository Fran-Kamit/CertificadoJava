import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n En el momento de decorar una casa, una habitación o cualquier objeto, " +
        "se plantea\nel problema de elegir la paleta de colores que vamos a utilizar en nuestra decoración.\n" +
        " Diseña la clase \"Colores\", que alberga por defecto una serie de colores, aunque es\nposible añadir" + 
        "tantos como necesitemos.\n");

        Scanner sc = new Scanner(System.in);
        int eleccion, verColores;
        String color;

        Colores colores = new Colores();
        
        System.out.println(" ¿Qué desea realizar?");
        System.out.print(" 1- Añadir un nuevo color, 2- Mostrar colores guardados: ");
        eleccion = sc.nextInt();

        while (eleccion < 1 || eleccion > 2) {
            System.out.print(" Introduzca una elección válida: ");
            eleccion = sc.nextInt();
        }

        do{
            do{
                switch (eleccion) {
                    case 1 -> {
                        System.out.print("\n Introduzca el color a añadir: ");
                        color = sc.next();
                        colores.addColor(color);
                    }
                    case 2 -> {
                        System.out.print("\n ¿Cuántos colores desea ver? ");
                        verColores = sc.nextInt();
                        System.out.println(Arrays.toString(colores.seleccionColores(verColores)));
                    }
                }
                System.out.println("\n ¿Qué desea realizar?");
                System.out.print(" 1- Añadir un nuevo color, 2- Mostrar los colores guardados, 0- Salir: ");
                eleccion = sc.nextInt();

            } while (eleccion < 0 || eleccion > 2);
        } while (eleccion >= 1 && eleccion <= 2);
        
        System.out.println("\n Saliendo del programa...");
        sc.close();
    }
}