import java.util.Arrays;

public class Colores {
    private String paleta[] = { "Rojo", "Verde", "Azul", "Amarillo" };

    public void addColor(String nuevoColor) {
        boolean existe = false;
        int i = 0;
        while (!existe && i < paleta.length) {
            if (paleta[i].equalsIgnoreCase(nuevoColor)) {
                existe = true;
            }
            i++;
        }
        if (!existe) {
            paleta = Arrays.copyOf(paleta, paleta.length + 1);
            paleta[paleta.length - 1] = nuevoColor;
        }
    }

    String[] seleccionColores(int cuantos){
        String color[];

        if (cuantos >= paleta.length) {
            color = Arrays.copyOf(paleta, paleta.length);
        } else {
            int indice[] = new int [paleta.length];
            for (int i = 0; i < paleta.length; i++) {
                indice[i] = i;
            }
            for (int i = 0; i < paleta.length; i++) {
                int a = (int) (Math.random() * indice.length);
                int b = (int) (Math.random() * indice.length);
                int aux = indice[a];
                indice[a] = indice[b];
                indice[b] = aux;
            }

            color = new String[cuantos];
            for (int i = 0; i < cuantos; i++) {
                color[i] = paleta[indice[i]];
            }
        }
        return color;
    }
}