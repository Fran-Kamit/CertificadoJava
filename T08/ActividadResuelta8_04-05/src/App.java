public class App {
    public static void main(String[] args) throws Exception {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Piano p = new Piano();
        for (Nota nota : cancion) {
            p.add(nota);
        }
        p.interpretar();
    }
}