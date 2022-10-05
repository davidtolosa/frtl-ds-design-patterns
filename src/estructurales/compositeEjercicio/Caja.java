package estructurales.compositeEjercicio;

import java.util.ArrayList;
import java.util.List;

public class Caja extends Componente {

    protected List<Componente> componentes = new ArrayList<Componente>();

    @Override
    public double cacularPeso() {
       double pesoComponentes = 0.0;     
        for(Componente c : componentes)
        {
            pesoComponentes += c.cacularPeso();
        }
        return pesoComponentes + peso;
    }

    @Override
    public boolean agregarComponente(Componente componente) {
        return componentes.add(componente);
    }    
}