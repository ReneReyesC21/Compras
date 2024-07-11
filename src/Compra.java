public class Compra implements Comparable<Compra>{
    //variable
    private double valor;
    private String descripcion;

    //constructor
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }
    //getter
    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra : valor=" + valor +
                ", descripcion='" + descripcion;
    }


    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
