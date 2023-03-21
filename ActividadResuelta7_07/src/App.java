import org.w3c.dom.Text;

public class App {
    public static void main(String[] args) throws Exception {
        Texto t = new Texto(5);
        t.addPrincipio("HO");
        t.addPrincipio(';');
        t.addFinal("Lá");
        t.addFinal('X');
        t.mostrar();
        System.out.println("Número de vocales: " + t.numVocales());
    }
}