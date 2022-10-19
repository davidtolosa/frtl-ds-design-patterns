package estructurales.compositeEjercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected List<DetallePedido> detallePedidos = new ArrayList<DetallePedido>();

    public void agregarDetallePedido(DetallePedido detallePedido)
    {
        detallePedidos.add(detallePedido);
    }

    public abstract boolean agregarPedido(Pedido pedido);
    public abstract double calcularTotal();
}