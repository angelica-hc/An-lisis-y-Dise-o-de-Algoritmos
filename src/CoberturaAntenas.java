import java.util.ArrayList;
import java.util.Arrays;

public class CoberturaAntenas {

    public static void resolver(int[] casas, int R) {

        // ordenar casas para aplicar greedy
        Arrays.sort(casas);

        ArrayList<Integer> antenas = new ArrayList<>();

        int i = 0;
        int n = casas.length;

        while (i < n) {

            // inicio del grupo no cubierto
            int inicio = casas[i];

            // avanzar dentro del rango izquierdo
            while (i < n && casas[i] <= inicio + R) {
                i++;
            }

            // colocar antena en mejor posición del grupo
            int antena = casas[i - 1];
            antenas.add(antena);

            // saltar casas cubiertas por la antena
            while (i < n && casas[i] <= antena + R) {
                i++;
            }
        }

        System.out.println("Antenas colocadas en:");

        for (int a : antenas) {
            System.out.println(a);
        }

        System.out.println("Cantidad total de antenas: " + antenas.size());
    }
}