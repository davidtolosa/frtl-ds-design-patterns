package estructurales.adapterEjercicio;

public class WindguruAdapter implements IClimaApi {

    @Override
    public Clima obtenerClima(String ciudad) {
        ApiWindGuru apiWindGuru = new ApiWindGuru();

        Clima clima = new Clima(apiWindGuru.seleccionarCiudad(ciudad), 
        apiWindGuru.obtenerTemperatura(), 
        apiWindGuru.obtenerHumedad(), 
        apiWindGuru.obtenerPresion());

        return clima;
    }
    
}