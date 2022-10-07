package estructurales.decorator;

public class VistaVehiculo implements ComponenteGraficoVehiculo {

    @Override
    public void visualiza() {
        System.out.println("Visualización del vehículo");
    }    
}