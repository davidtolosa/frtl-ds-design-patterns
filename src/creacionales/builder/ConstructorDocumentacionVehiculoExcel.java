package creacionales.builder;

public class ConstructorDocumentacionVehiculoExcel extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoExcel() {
        documentacion = new DocumentacionExcel();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento;
        documento = "<Excel>Solicitud de pedido Cliente: " +
                nombreCliente + "</Excel>";
        documentacion.agregaDocumento(documento);

    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento;
        documento = "<Excel>Solicitud de matriculacion Solicitante: " +
                nombreSolicitante + "</Excel>";
        documentacion.agregaDocumento(documento);
    }
}