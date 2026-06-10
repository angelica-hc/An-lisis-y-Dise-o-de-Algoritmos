import java.util.Arrays;
import java.util.Comparator;

public class MochilaFraccional {

    public static void resolver(Objeto[] objetos, double capacidad) {

        // Ordenar por valor/peso de mayor a menor
        Arrays.sort(objetos,
                Comparator.comparingDouble(Objeto::getRelacion).reversed());

        double valorTotal = 0;

        System.out.println("Objetos seleccionados:");

        for (Objeto obj : objetos) {

            if (capacidad == 0)
                break;

            // Si entra completo
            if (obj.peso <= capacidad) {

                System.out.println(obj.nombre + " completo");

                capacidad -= obj.peso;
                valorTotal += obj.valor;

            } else {

                // Tomar fracción
                double fraccion = capacidad / obj.peso;

                System.out.println(
                        capacidad + "/" + obj.peso
                                + " parte de "
                                + obj.nombre);

                valorTotal += obj.valor * fraccion;

                capacidad = 0;
            }
        }

        System.out.println("Valor total: " + valorTotal);
    }
}