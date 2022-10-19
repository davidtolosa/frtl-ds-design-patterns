package estructurales.decoratorEjercicio;

public class CreamaDecorador extends Decorador {

    public CreamaDecorador(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {
        return super.costo() + 10;
    }

    @Override
    public String getDesripcion() {
        return super.getDesripcion() + " con Crema";
    }
    
    
}