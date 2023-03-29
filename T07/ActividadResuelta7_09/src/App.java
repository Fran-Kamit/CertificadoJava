public class App {
    public static void main(String[] args) throws Exception {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1 .enciende();
        b2 .apaga();
        
        System.out.println("Bombilla 1 = " + b1 .muestraEstado());
        System.out.println("Bombilla 2 = " + b2 .muestraEstado());

        Bombilla .interruptorGeneral = false;

        System.out.println("\nCortamos la luz general");
        System.out.println("Bombilla 1 = " + b1 .muestraEstado());
        System.out.println("Bombilla 2 = " + b2 .muestraEstado());

        Bombilla .interruptorGeneral = true;
        
        System.out.println("\nActivamos la luz general");
        System.out.println("Bombilla 1 = " + b1 .muestraEstado());
        System.out.println("Bombilla 2 = " + b2 .muestraEstado());
    }
}