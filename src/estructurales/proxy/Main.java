package estructurales.proxy;

public class Main {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.click();
        
        animacion.dibuja();
    }
}