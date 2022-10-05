package estructurales.compositeEjercicio;

public class Objeto extends Componente {

    @Override
    public double cacularPeso() {
        return peso;
    }

    @Override
    public boolean agregarComponente(Componente componente) {
        return false;
    }
    
}