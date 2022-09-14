package creacionales.builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ConstructorDocumentacionVehiculo constructor;

        System.out.print("Desea generar " +
                "documentacion HTML (1), PDF (2) o Excel(3):");
        String seleccion = reader.next();
        if (seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHtml();
        } else if (seleccion.equals("2")) {
            constructor = new ConstructorDocumentacionVehiculoPdf();
        } else {
            constructor = new ConstructorDocumentacionVehiculoExcel();
        }
        reader.close();
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construye("Martin");
        documentacion.imprime();
    }
}