public class Objeto {

    String nombre;
    double valor;
    double peso;

    public Objeto(String nombre, double valor, double peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public double getRelacion() {
        return valor / peso;
    }
}