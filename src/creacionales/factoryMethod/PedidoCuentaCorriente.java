package creacionales.factoryMethod;

public class PedidoCuentaCorriente extends Pedido {

    
    public PedidoCuentaCorriente(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (importe <= 1000.0);
    }

    @Override
    public void paga() {
        System.out.println(
                "El pago del pedido a Cuenta Corriete de: " +
                        importe + " se ha realizado.");        
    }
    
}