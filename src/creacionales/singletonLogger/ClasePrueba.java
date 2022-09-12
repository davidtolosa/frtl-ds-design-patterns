package creacionales.singletonLogger;

public class ClasePrueba {
    public ClasePrueba() {
        Looger logger = Looger.Instance();
        logger.logInfo("Se creo clase prueba");
    }
}