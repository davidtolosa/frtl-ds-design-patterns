package estructurales.decoratorEjemplo;

public class NotificadorCorreo implements Notificador {
    @Override
    public void enviar(String mensaje) {
       System.out.println("Enviando por Email: " + mensaje);
    }    
}