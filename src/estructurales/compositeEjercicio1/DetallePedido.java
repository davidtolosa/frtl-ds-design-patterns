package estructurales.compositeEjercicio1;

public class DetallePedido {
    
    private String codigo;
    private int cantidad;
    private double importe;
    
    
    public DetallePedido(String codigo, int cantidad, double importe) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporte() {
        return importe;
    }    
}