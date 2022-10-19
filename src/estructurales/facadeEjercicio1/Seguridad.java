package estructurales.facadeEjercicio1;

public class Seguridad {
    private int codigoSeguridad = 1234;

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public boolean codigoCheck(int codigoSeguridad) {
        if (codigoSeguridad == getCodigoSeguridad()) {
            return true;
        } else {
            return false;
        }
    }
}