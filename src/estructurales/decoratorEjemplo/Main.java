package estructurales.decoratorEjemplo;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorCorreo();
        notificador = new SlackNotificador(notificador);
        notificador = new InstagramNotificador(notificador);
        
        notificador.enviar("Prueba");        
    }
}