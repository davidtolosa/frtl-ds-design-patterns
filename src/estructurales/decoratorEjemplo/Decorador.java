package estructurales.decoratorEjemplo;

public abstract class Decorador implements Notificador {

    protected Notificador notificador;

    public Decorador(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviar(String mensaje) {
        notificador.enviar(mensaje);
    }
    
}