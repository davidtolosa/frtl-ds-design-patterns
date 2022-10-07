package estructurales.decoratorEjemplo;

public class SlackNotificador extends Decorador {

    public SlackNotificador(Notificador notificador) {
        super(notificador);
    }
    
    public void enviarMensaje(String mensaje)
    {
        System.out.println("Enviando mensaje por Slack: " + mensaje);
    }

    public void enviar(String mensaje) {
       super.enviar(mensaje);
       enviarMensaje(mensaje);
    }
}