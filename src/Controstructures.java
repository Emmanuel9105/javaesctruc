import java.util.Scanner;

public class Controstructures {
    public static void main(String[] args) { // siempre el main

        //1 Estructura secuencial
        System.out.println("Hola");
        int num = 2;
        final String CAD = "Emmanuel"; //Final = constante en js const CAD

        //2 Estructuras condicionales alternativas o selectivas

        //2.1 alternativa simple

        Scanner scn = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scn.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        System.out.println("Programa terminado");

        //2.2 Alternativa doble
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");

        }
        System.out.println("Programa terminado2");

        //2.3 Anidadas(nested)

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            if (edad == 20) {
                System.out.println("...Tienes 20 añazos");
            }
        } else {
            System.out.println("Eres menos de edad");

        }

        //optimizacion
        boolean mayorEdad = false;
        if (edad >= 18) {
            mayorEdad = true;
        } else {
            mayorEdad = false;
        }
        System.out.println(mayorEdad);
        mayorEdad = edad >= 18;
        System.out.println(mayorEdad);

        //2.4Condicion multiple
        if (edad >= 0 && edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("Eres adulto");
        }else if (edad >=65 &&  edad <100){
            System.out.println("Eres un viejete");
        }

        switch(edad){
            case 18:
                System.out.println("Tienes 18 años");
                break;
            case 65:
                System.out.println("Eres anciano");
                break;
            case 100:
                System.out.println("Enhorabuena");
                break;
            default:
                System.out.println("Buena edad la que tienes");
        }








    }
}
