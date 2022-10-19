package estructurales.decoratorEjercicio;

public class Latte implements Cafe {

    @Override
    public double costo() {
        return 76;
    }

    @Override
    public String getDesripcion() {
        return "Cafe Latte";
    }
    
}