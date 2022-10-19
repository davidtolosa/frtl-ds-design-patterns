package estructurales.decoratorEjercicio;

public abstract class Decorador implements Cafe {

    protected Cafe componente;

    public Decorador(Cafe cafe) {
        this.componente = cafe;
    }

    @Override
    public double costo() {
        return componente.costo();
    }

    @Override
    public String getDesripcion() {
        return componente.getDesripcion();
    }    
}