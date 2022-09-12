package repasoclases;

public class ManejadorBDPostgres implements IManejadorBD {

    public Boolean agregarAlumo(String nombre, String apellido) {
        System.out.println("Alumno agregado");
        return true;
    }
    
}