package estructurales.facadeEjercicio1;

public class Main {
    public static void main(String[] args) {
        
        ISDKBanco sdkBanco = new SDKBanco();
        sdkBanco.depositarDinero("123", 1000);
    }
}