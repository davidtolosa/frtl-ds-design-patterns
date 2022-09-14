package creacionales.builder;

public class DocumentacionExcel extends Documentacion {

    @Override
    public void agregaDocumento(String documento) {
        if (documento.startsWith("<Excel>"))
            contenido.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Documentacion Excel");

        for (String s : contenido)
            System.out.println(s);
    }

}