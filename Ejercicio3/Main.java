public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(25);
        persona.setNombre("Jovanny Cortez");
        persona.setTelefono("1234567890");

        System.out.println("Nuevo objeto persona");
        System.out.println("Nombre: \t" + persona.getNombre());
        System.out.println("Edad: \t\t" + persona.getEdad());
        System.out.println("Telefono: \t" + persona.getTelefono());
    }
}
