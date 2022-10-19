package estructurales.decoratorEjercicio;

public class Capuchino implements Cafe {

    @Override
    public double costo() {
        return 80;
    }

    @Override
    public String getDesripcion() {
        return "Cafe Capuchino";
    }
    
}