package creacionales.factoryMethod;

public class ClienteCuentaCorriente extends Cliente {
    protected Pedido creaPedido(double importe) {
        return new PedidoCuentaCorriente(importe);
    }
}