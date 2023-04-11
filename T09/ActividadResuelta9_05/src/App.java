import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola(){
            Lista l = new Lista();

            @Override
            public void encolar(Integer nuevo){
                l.insertarFinal(nuevo);
            }

            @Override
            public Integer desencolar(){
                return l.eliminar(0);
            }
        };

        Integer n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introducir número (negativo para salir): ");
        n = sc.nextInt();

        while (n >= 0){
            cola.encolar(n);
            System.out.print("Introducir número: ");
            n = sc.nextInt();
        }

        n = cola.desencolar();

        while (n != null){
            System.out.print(n + " ");
            n = cola.desencolar();
        }    
        sc.close(); 
    }
}