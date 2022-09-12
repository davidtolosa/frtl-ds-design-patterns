package repasoclases;

public class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        System.out.println("Se creo el objeto");
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
}