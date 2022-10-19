package estructurales.decoratorEjercicio;

public class Main {
    public static void main(String[] args) {
        
        Cafe cafe = new Capuchino();
        cafe = new CanelaDecorador(cafe);
        cafe = new CreamaDecorador(cafe);
        cafe = new ChocolateDecoradro(cafe);
        
        System.out.println(cafe.costo());
        System.out.println(cafe.getDesripcion());
    }
}