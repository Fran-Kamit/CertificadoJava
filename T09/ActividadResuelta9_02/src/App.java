import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Integer n;
        Scanner sc = new Scanner(System.in);

        Lista x = new Lista();
        
        System.out.print(" Introduzca un número positivo: (Para dejar de introducir números,\nintroduzca un nº negativo) ");
        n = sc.nextInt();

        while (n >= 0) {
            x.encolar(n);
            System.out.print(" Introduzca número: ");
            n = sc.nextInt();
        }
        n = x.desencolar();

        while (n != null){
            System.out.print(n + " ");
            n = x.desencolar();
        }
        System.out.println("");

        sc.close();
    }
}