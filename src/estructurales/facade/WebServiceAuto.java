package estructurales.facade;

import java.util.List;

public interface WebServiceAuto {
    String documento(int indice);
    List<String> buscaVehiculos(int precioMedio, int desviacionMax);
}