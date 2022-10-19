package estructurales.facadeEjercicio1;

public class SDKBanco implements ISDKBanco {

    Seguridad seguridad;

    public SDKBanco() {
        seguridad = new Seguridad();
    }

    @Override
    public boolean depositarDinero(String password, double cantidad) {
        
       if(seguridad.codigoCheck(Integer.parseInt(password)) == false)
       {
        System.out.println("Password incorrecta");        
        return false;
       }

       MensajeBienvenida mensajeBienvenida = new MensajeBienvenida();

       return false;
    }

    @Override
    public boolean retirarDinero(String password, double cantidad) {
        // TODO Auto-generated method stub
        return false;
    }
    
}