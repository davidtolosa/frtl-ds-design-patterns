package estructurales.proxy;

public class Video implements Animacion {

    @Override
    public void dibuja() {
        System.out.println("Mostrar el vídeo");
    }

    @Override
    public void click() {

    }

    public void carga() {
        System.out.println("Cargar el vídeo");
    }

    public void reproduce() {
        System.out.println("Reproducir el vídeo");
    }
}