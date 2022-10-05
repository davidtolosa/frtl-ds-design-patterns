package estructurales.compositeEjercicio;

public abstract class Componente {
    
        protected double peso;
    
        public void setPeso(double p)
        {
            peso = p;
        }
    
        public abstract double cacularPeso(); 
        public abstract boolean agregarComponente(Componente componente);
}