package estructurales.composite;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregaVehiculo();
        
        System.out.println("Costo manteniemiento Empresa 1: " + empresa1.calculaCosteMantenimiento());
       
        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregaVehiculo();
        empresa2.agregaVehiculo();

        System.out.println("Costo mantenimiento Empresa 2: " + empresa2.calculaCosteMantenimiento());

        Empresa grupo = new EmpresaMadre();
        grupo.agregaFilial(empresa1);
        grupo.agregaFilial(empresa2);
        grupo.agregaVehiculo();
                
        System.out.println(
                "Costo de mantenimiento total del grupo: " +
                        grupo.calculaCosteMantenimiento());
    }
}
