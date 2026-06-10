import java.util.Arrays;
import java.util.Comparator;

public class MochilaFraccional {

    public static void resolver(Objeto[] objetos, double capacidad) {

        // ordenar por mayor relación valor/peso (greedy)
        Arrays.sort(objetos,
                Comparator.comparingDouble(Objeto::getRelacion).reversed());

        double valorTotal = 0;

        System.out.println("Objetos seleccionados:");

        for (Objeto obj : objetos) {

            // si no hay capacidad, terminar
            if (capacidad <= 0)
                break;

            // caso 1: entra completo
            if (obj.peso <= capacidad) {

                System.out.println(obj.nombre + " -> completo");

                capacidad -= obj.peso;
                valorTotal += obj.valor;

            } 
            // caso 2: tomar fracción
            else {

                double fraccion = capacidad / obj.peso;

                System.out.println(obj.nombre + " -> fracción " + capacidad + "/" + obj.peso);

                valorTotal += obj.valor * fraccion;

                capacidad = 0;
            }
        }

        System.out.println("Valor total: " + valorTotal);
    }
}