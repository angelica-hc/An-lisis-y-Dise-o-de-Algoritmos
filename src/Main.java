public class Main {

    public static void main(String[] args) {

        System.out.println("=== MOCHILA FRACCIONAL ===");

        Objeto[] objetos = {

                new Objeto("A", 60, 10),
                new Objeto("B", 100, 20),
                new Objeto("C", 120, 30)

        };

        MochilaFraccional.resolver(objetos, 50);

        System.out.println("\n=== COBERTURA DE ANTENAS ===");

        int[] casas = {1, 2, 7, 11, 20, 21, 30};

        CoberturaAntenas.resolver(casas, 5);
    }
}