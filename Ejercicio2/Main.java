
public class Main{
    public static void main(String[] args){
        
        System.out.println("----- sentencia if ------");
        sentenciaIf();
        System.out.println("----- sentencia while ------");
        sentenciaWhile();
        System.out.println("----- sentencia do while------");
        sentenciDoWhile();
        System.out.println("----- sentencia for ------");
        sentenciaFor();
        System.out.println("----- sentencia switch------");
        sentenciaSwitch();

    }

    public static void sentenciaIf(){
        int numeroif = 0;
        if(numeroif == 0){
            System.out.println("Es igual a cero");
        }else if (numeroif > 0){
            System.out.println("Es un numero positivo");
        }else{
            System.out.println("Es un numero negativo");
        }
    }

    public static void sentenciaWhile(){
        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("Numero: " + numeroWhile);
        }
    }

    public static void sentenciDoWhile(){
        int numeroWhile = 2;
        do{
            numeroWhile++;
            System.out.println("Numero: " + numeroWhile);
        }while(numeroWhile < 3);
    }

    public static void sentenciaFor(){
        int numeroFor;

        for(numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("valor del numero: " + numeroFor);
        }
    }

    public static void sentenciaSwitch(){
        String estacion = "OTONIO";

        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en: " + estacion);
                break;
            case "VERANO":
                System.out.println("Estamos en: " + estacion);
                break;
            case "OTONIO":
                System.out.println("Estamos en: " + estacion);
                break;
            case "INVIERNO":
                System.out.println("Estamos en: " + estacion);
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}