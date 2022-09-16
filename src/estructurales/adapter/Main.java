package estructurales.adapter;

public class Main {
    public static void main(String[] args) {
        Documento documento1, documento2;
        documento1 = new DocumentoHtml();
        documento1.setContenido("Documento 1");
        documento1.dibuja();
        System.out.println();

        documento2 = new DocumentoPdf();
        documento2.setContenido("Documento 2");
        documento2.dibuja();
        System.out.println();
    }
}