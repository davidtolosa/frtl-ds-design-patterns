package estructurales.decoratorEjercicio;

public class CanelaDecorador extends Decorador {

    public CanelaDecorador(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double costo() {        
        return super.costo() + 5;
    }

    @Override
    public String getDesripcion() {
        return super.getDesripcion() + " con Canela";
    }
}