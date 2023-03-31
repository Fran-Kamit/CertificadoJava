public class Compra {
    private final double[] dinero = {500.0, 200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
    private double[] devolver = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public void calcular(Double cambio) {
        for (int i = 0; i < dinero.length && cambio != 0; i++) {
            devolver[i] = Math.floor(cambio / dinero[i]);
            cambio -= devolver[i] * dinero[i];
            //System.out.println(cambio);
        }
        /*Comprobación de cambio porque cuando calcula, al redondear, da menos de 0.01*/
        if (cambio >= 0.009 && cambio != 0.0) {
            devolver[14] = 1;
        }
        /*/////////////////*/
    }

    public void mostrarDevolucion() {
        for (int i = 0; i < dinero.length; i++) {
            if (dinero[i] > 2 && devolver[i] > 0) {
                System.out.println((int)devolver[i] + " billetes de " + dinero[i] + " €");
            } else  if (dinero[i] <= 2 && devolver[i] > 0){
                System.out.println((int)devolver[i] + " monedas de " + dinero[i] + " €");
            }
        }
    }
}