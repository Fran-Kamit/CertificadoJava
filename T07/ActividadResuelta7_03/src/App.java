public class App {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c;
        c = new CuentaCorriente("12345678A", "Pepe");
        c.saldo = 2000;
        c.dni = "111111111-T";
        c.nombre = "Antonio";
    }
}