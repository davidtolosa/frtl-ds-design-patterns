package creacionales.singletonLogger;

public class Main {
   public static void main(String[] args) {
        Looger looger = Looger.Instance();
        looger.logDebug("Main");    
        looger.logError("Prueba Error");

        ClasePrueba prueba = new ClasePrueba();
   }
}