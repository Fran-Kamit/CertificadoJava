import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Inserte el valor de a: ");
        a = sc.nextInt();

        System.out.print("Insete el valor de b: ");
        b = sc.nextInt();

        System.out.print("Insete el valor de c: ");
        c = sc.nextInt();

        Ecuacion2Grado ec = new Ecuacion2Grado(a, b, c);

        //System.out.println(ec.esPositivoDiscriminante());
        double soluciones[] = ec.solucion();

        System.out.println("x1 = " + soluciones[0]);
        System.out.println("x2 = " + soluciones[1]);
        sc.close();
    }
}