package estructurales.decoratorEjemplo;

public class InstagramNotificador extends Decorador {

    public InstagramNotificador(Notificador notificador) {
        super(notificador);
    }

    public void enviarMensaje(String mensaje)
    {
        System.out.println("Enviando mensaje por Instagram: " + mensaje);
    }

    public void enviar(String mensaje) {
       super.enviar(mensaje);
       enviarMensaje(mensaje);
    }
    
}