
public class Main{
    public static void main(String []args){
        Coche coche = new Coche();

        System.out.println(coche.numeroPuertas);
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        coche.incrementarPuertas();
        System.out.println(coche.numeroPuertas);
    }
}