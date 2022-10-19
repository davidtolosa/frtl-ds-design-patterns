package estructurales.facadeEjercicio1;

public interface ISDKBanco {
    public boolean depositarDinero(String password, double cantidad);
    public boolean retirarDinero(String password, double cantidad);
}