public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente(25, "Jovanny Cortez", "1234567890", 1500.00);
        System.out.println(cliente.toString());

        Trabajador trabajador = new Trabajador(25, "Alejandra Galindo", "1234567891", 3500.00);
        System.out.println(trabajador.toString());
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
    Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String toStringAll(){
        return "Nombre: \t" + nombre + "\n"
        + "Edad: \t\t" + edad + "\n"
        + "telefono: \t" + telefono + "\n";
    }
}

class Cliente extends Persona{
    double credito;

    Cliente(int edad, String nombre, String telefono, double credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public String toString(){
        return "Datos del cliente \n"
        + toStringAll()
        + "credito: \t" + credito + "\n";
    }
}

class Trabajador extends Persona{
    double salario;

    Trabajador(int edad, String nombre, String telefono, double salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public String toString(){
        return "Datos del cliente \n"
        + toStringAll()
        + "salario: \t" + salario + "\n";
    }
}
