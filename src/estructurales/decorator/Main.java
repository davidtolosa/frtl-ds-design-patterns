package estructurales.decorator;

public class Main {
    public static void main(String[] args) {
        ComponenteGraficoVehiculo componente = new VistaVehiculo();
        componente = new ModeloDecorador(componente);
        componente = new MarcaDecorador(componente);

        componente.visualiza();
    }
}