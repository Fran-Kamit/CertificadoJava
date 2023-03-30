public class App {
    public static void main(String[] args) throws Exception {
        CuentaCorriente c1, c2, c3;

        Gestor g1 = new Gestor("Antonio González", "666555444");
        Gestor g2 = new Gestor("Bea Rodríguez", "987546210", 12000.0);

        c1 = new CuentaCorriente("12345678-A", "Pepita", g1);
        c2 = new CuentaCorriente("98765432-Z", "Ana", g1);
        c3 = new CuentaCorriente("11222333-B", "Sancho");
        
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();
        c1 .setGestor(g2);
        c1.mostrarInformacion();
    }
}