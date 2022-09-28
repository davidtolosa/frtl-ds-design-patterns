package estructurales.adapterEjercicio;

public class ApiServicioMeteorologicoNacional implements IClimaApi {

    @Override
    public Clima obtenerClima(String ciudad) {
        return new Clima(ciudad, 13, 80, 1300);
    }
    
}