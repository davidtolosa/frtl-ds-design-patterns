package estructurales.compositeEjercicio1;

public class Main {
    public static void main(String[] args) {
        
        Pedido p1 = new PedidoCompuesto();
        p1.agregarDetallePedido(new DetallePedido("c1", 1, 10));
        p1.agregarDetallePedido(new DetallePedido("c2", 2, 10));

        Pedido p2 = new PedidoSimple();
        p2.agregarDetallePedido(new DetallePedido("c3", 1, 10));
        
        p1.agregarPedido(p2);
        
        System.out.println("Total: " + p1.calcularTotal());
    }
}