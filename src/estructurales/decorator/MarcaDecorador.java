package estructurales.decorator;

public class MarcaDecorador extends Decorador {

    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }

    public void visualizaMarca(){
        System.out.println("Logotipo de la marca");
    }
    
    public void visualiza(){
        super.visualiza();
        visualizaMarca();
    }
}