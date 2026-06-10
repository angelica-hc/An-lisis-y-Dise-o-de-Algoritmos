import java.util.ArrayList;
import java.util.Arrays;

public class CoberturaAntenas {

    public static void resolver(int[] casas, int R) {

        Arrays.sort(casas);

        ArrayList<Integer> antenas = new ArrayList<>();

        int i = 0;
        int n = casas.length;

        while (i < n) {

            // Colocar antena
            int posicion = casas[i] + R;

            antenas.add(posicion);

            // Saltar casas cubiertas
            while (i < n && casas[i] <= posicion + R) {
                i++;
            }
        }

        System.out.println("Antenas colocadas en:");

        for (int antena : antenas) {
            System.out.println(antena);
        }

        System.out.println("Cantidad total: " + antenas.size());
    }
}