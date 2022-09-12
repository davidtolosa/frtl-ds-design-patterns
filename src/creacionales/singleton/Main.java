package creacionales.singleton;

public class Main {
    public static void main(String[] args) {
        Vendedor v1 = Vendedor.Instance();
        v1.setNombre("David");

        Vendedor v2 = Vendedor.Instance();
        v2.setNombre("Pedro");

        System.out.println(v1.getNombre()); 
        System.out.println(v2.getNombre());
    }
}