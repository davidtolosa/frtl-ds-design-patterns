package estructurales.proxy;

public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "mostar la foto";

    public void click() {
        if (video == null) {
            video = new Video();
            video.carga();
        }
        video.reproduce();
    }

    public void dibuja() {
        if (video != null)
            video.dibuja();
        else
            dibuja(foto);
    }

    public void dibuja(String foto) {
        System.out.println(foto);
    }
}