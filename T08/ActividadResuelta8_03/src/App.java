public class App {
    public static void main(String[] args) throws Exception {
        HoraExacta a = new HoraExacta(1, 2, 3);
        HoraExacta b = new HoraExacta(1, 2, 3);
        HoraExacta c = new HoraExacta(10, 20, 30);

        a.equals(b);
        System.out.println("¿Son iguales? " + a.igual());

        a.equals(c);
        System.out.println("¿Son iguales? " + a.igual());
    }
}