public class App {
    public static void main(String[] args) throws Exception {
        HoraExacta a = new HoraExacta(01, 02, 03);
        HoraExacta b = new HoraExacta(01, 02, 03);
        HoraExacta c = new HoraExacta(10, 20, 30);

        a.equals(b);
        System.out.println(a + " (a) y " + b + " (b) ¿Son iguales? " + a.igual());

        a.equals(c);
        System.out.println(a + " (a) y " + c + " (b) ¿Son iguales? " + a.igual());
    }
}