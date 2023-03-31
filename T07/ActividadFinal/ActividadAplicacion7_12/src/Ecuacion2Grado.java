public class Ecuacion2Grado {
    private double a, b, c;

    public Ecuacion2Grado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double[] solucion() {
        double solucion[] = new double[2];
        if (!esPositivoDiscriminante()) {
            solucion[0] = solucion[1] = Double.NaN;
        } else {
            double d = discriminante();
            solucion[0] = (-b + Math.sqrt(d)) / (2 * a);
            solucion[1] = (-b - Math.sqrt(d)) / (2 * a);
        }
        return solucion;
    }

    private double discriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean esPositivoDiscriminante() {
        return discriminante() >= 0;
    }
}