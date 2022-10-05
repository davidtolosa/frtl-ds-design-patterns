package estructurales.compositeEjercicio;

public class Main {
    public static void main(String[] args) {
        
        Componente casco = new Objeto();
        casco.setPeso(1);

        System.out.println("Peso Casco:" + casco.cacularPeso());

        Componente monitor = new Objeto();
        monitor.setPeso(3);

        System.out.println("Peso Monitor:" + monitor.cacularPeso());

        Componente caja = new Caja();
        caja.setPeso(0.5);
        caja.agregarComponente(casco);
        caja.agregarComponente(monitor);

        System.out.println("Peso Caja:" + caja.cacularPeso());
    }
}