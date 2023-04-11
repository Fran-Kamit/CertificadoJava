public class App {
    public static void main(String[] args) throws Exception {
        Lista l1 = new Lista();
        Lista l2 = new Lista();

        l1.insertarFinal(4);
        l1.insertarFinal(5);
        l1.insertarFinal(6);
        System.out.print("Lista 1: "); l1.mostrar();

        l1.insertarPrincipio(3);
        l1.insertarPrincipio(2);
        l1.insertarPrincipio(1);
        System.out.print("Lista 1: "); l1.mostrar();

        l1.insertar(2, 99);
        System.out.print("Lista 1: "); l1.mostrar();
        l1.eliminar(2);
        System.out.print("Lista 1: "); l1.mostrar();

        System.out.println("La clave de búsqueda para 4 = " + l1.buscar(4));

        l2.insertarFinal(10);
        l2.insertarFinal(20);
        l2.insertarFinal(30);
        l2.insertarFinal(40);
        l2.insertarFinal(50);
        System.out.print("Lista 2: "); l2.mostrar();

        l1.insertarFinal(12);
        System.out.print("Lista 1: "); l1.mostrar();
    }
}