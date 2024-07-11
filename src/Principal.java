import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe el limite de la tarjeta de Credito: ");
        double limite = lectura.nextDouble();
        TarjetaCredito tarjeta = new TarjetaCredito(limite);

        int salir = 3;
        while(salir != 0 ){
            System.out.println("Escriba la descripcion de la compra: ");
            String descripcion = lectura.next();

            System.out.println("Escribe el valor de la compra: ");
            double valor = Double.valueOf(lectura.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRelaizada = tarjeta.lanzarCompra(compra);

            if (compraRelaizada){
                System.out.println("Compra Realizada");
                System.out.println("Escriba 0 para sali o 1 para continuar");
                salir = lectura.nextInt();
            }else{
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
        }
        System.out.println("**************************");
        System.out.println("COMPRA REALIZADA:n");
        for (Compra compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n**************************");
        System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
