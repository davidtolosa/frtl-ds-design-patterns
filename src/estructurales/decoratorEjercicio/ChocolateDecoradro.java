package estructurales.decoratorEjercicio;

public class ChocolateDecoradro extends Decorador {

    public ChocolateDecoradro(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {
        return super.costo() + 17;
    }

    @Override
    public String getDesripcion() {
        return super.getDesripcion() + " con Chocolate";
    }

    
    
}