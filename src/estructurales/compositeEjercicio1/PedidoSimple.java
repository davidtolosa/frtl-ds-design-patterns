package estructurales.compositeEjercicio1;

public class PedidoSimple extends Pedido {

    @Override
    public boolean agregarPedido(Pedido pedido) {
        return false;        
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        
        for(DetallePedido detalle : detallePedidos)
        {
            total += detalle.getImporte() * detalle.getCantidad();
        }

        return total;
    }
    
}