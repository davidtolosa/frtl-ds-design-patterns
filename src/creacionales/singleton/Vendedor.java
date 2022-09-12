package creacionales.singleton;

public class Vendedor {
    private String nombre;
    private String apellido;
    private String mail;
      
    private static Vendedor _instance = null;

    public static Vendedor Instance()
    {
        if(_instance == null)
            _instance = new Vendedor();
           
         return _instance;   
    }

    private Vendedor() {
        System.out.println("Se creo el objeto");
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    
}