package estructurales.composite;

public class EmpresaSinFilial extends Empresa {

    @Override
    public double calculaCosteMantenimiento() {
        return costeUnitarioVehiculo * nVehiculos;
    }

    @Override
    public boolean agregaFilial(Empresa filial) {
        return false;
    }    
}