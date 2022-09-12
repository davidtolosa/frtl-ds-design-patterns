package creacionales.singletonLogger;

import java.time.LocalDateTime;

public class Looger {

    private static Looger looger = null;

    private Looger() {
        System.out.println("Se creo Logger");
    }

    public static Looger Instance()
    {
        if(looger == null)
            looger = new Looger();

        return looger;
    }

    public void logError(String mensaje)
    {
        System.out.println(LocalDateTime.now() + " Error: " + mensaje);
    }

    public void logInfo(String mensaje)
    {
        System.out.println(LocalDateTime.now() + " Info: " + mensaje);
    }

    public void logDebug(String mensaje)
    {
        System.out.println(LocalDateTime.now() + " Debug: " + mensaje);
    }
}