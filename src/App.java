import repasoclases.Alumno;
import repasoclases.Cliente;
import repasoclases.Estatica;
import repasoclases.IManejadorBD;
import repasoclases.ManejadorBDPostgres;
import repasoclases.ManjadorBDSQL;
import repasoclases.Persona;

public class App {
    public static void main(String[] args){
       Cliente c1 = new Cliente("David","d@gmail.com");
    
      Persona p1 = new Alumno("Nombre", "Apellido"); 

       System.out.println(c1.getNombre());
       
          
       IManejadorBD manejadorBd = new ManjadorBDSQL();
       
       
       manejadorBd.agregarAlumo("David", "T");

       Estatica.mostrarHola();
    }
}
