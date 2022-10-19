package estructurales.decoratorEjercicio;

public class Descafeinado implements Cafe{

    @Override
    public double costo() {
        return 50;
    }

    @Override
    public String getDesripcion() {
        return "Cafe Descafeinado";
    }
    
}