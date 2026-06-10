public class Objeto {
//atributos del objeto
    String nombre;
    double valor;
    double peso;
    //constructor
        public Objeto(String nombre, double valor, double peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public double getRelacion() {
        return valor / peso;
    }
}