import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {
    //variables
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;
    //constructor
    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    //metodo
    public boolean lanzarCompra(Compra compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    //getter
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
