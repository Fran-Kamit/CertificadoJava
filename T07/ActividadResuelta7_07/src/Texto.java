import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    private String cad;
    LocalDate creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiouáéíóúüï";

    public Texto(int longitudMax) {
        cad = "";
        this.LONGITUD_MAX = longitudMax;
        creacion = LocalDate.now();
        ultimaModificacion = null;
    }

    public void addFinal(String c) {
        if (LONGITUD_MAX >= cad.length() + c.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addFinal(char c) {
        if (LONGITUD_MAX > cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(char c) {
        if (LONGITUD_MAX > cad.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(String c) {
        if (LONGITUD_MAX >= cad.length() + c.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void mostrar() {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Última modificación: " + ultimaModificacion);
        System.out.println(cad);
    }

    public int numVocales() {
        int vocal = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
                vocal++;
            }
        }
        return (vocal);
    }

    private boolean esVocal(char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);

        if (VOCALES.indexOf(c) != -1) {
            vocal = true;
        }
        return (vocal);
    }
}