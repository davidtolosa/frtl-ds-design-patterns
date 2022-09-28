package estructurales.adapterEjercicio;

public class Main {
    public static void main(String[] args) {
        
        //IClimaApi api = new ApiServicioMeteorologicoNacional();
        
        IClimaApi api = new WindguruAdapter();       
        Clima clima = api.obtenerClima("Trenque Lauquen");

        System.out.println(clima.toString()); 
    }
}