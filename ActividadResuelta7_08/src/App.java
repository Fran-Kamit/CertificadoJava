public class App {
    public static void main(String[] args) throws Exception {
        SintonizadorFM a, b;
        a = new SintonizadorFM(107);
        a.up(); a.up(); a.up(); a.up();
        a.display();

        b = new SintonizadorFM(80.5);
        b.down(); b.down(); b.down();
        b.display();

        a = new SintonizadorFM(200);
        a.display();
    }
}