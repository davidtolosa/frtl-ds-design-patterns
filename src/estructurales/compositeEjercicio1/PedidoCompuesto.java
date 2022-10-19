package estructurales.compositeEjercicio1;

import java.util.ArrayList;
import java.util.List;

public class PedidoCompuesto extends Pedido {

    protected List<Pedido> pedidos = new ArrayList<Pedido>();
    
    @Override
    public boolean agregarPedido(Pedido pedido) {
        return pedidos.add(pedido);
    }

    @Override
    public double calcularTotal() {
        double totalProductos = 0;
        double totalPedidos = 0;

        for (Pedido pedido : pedidos) {
            totalPedidos += pedido.calcularTotal();
        }

        for (DetallePedido detallePedido : detallePedidos) {
            totalProductos += detallePedido.getImporte() * detallePedido.getCantidad();
        }

        return totalPedidos + totalProductos;
    }
    
}