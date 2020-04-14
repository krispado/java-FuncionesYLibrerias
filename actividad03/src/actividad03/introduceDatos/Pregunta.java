package actividad03.introduceDatos;

import java.util.Scanner;



/*
Desc: Clase publica que contiene las funciones que solicitan datos al usuario
Input: N/A
Output: N/A
*/
    


public class Pregunta {

    /*
    Desc: Solicita al usuario que introduzca un valor Integer. La funcion controla que el valor es correcto o devuelve un error. 
    Input: La funcion recibe un String con el texo que se mostrará al usuaio
    Output: La funcion devulve un valor Integer, una vez comprobado que el valor es correcto.
    */
    
    public static int piderEntero(String pregunta){
        
    int valorEntero = 0;

    boolean devuelveValor = false;

        do {

            try {

                System.out.println(pregunta);

                Scanner myObj = new Scanner(System.in);

                valorEntero = Integer.parseInt(myObj.nextLine());

                devuelveValor = true;

            } catch (NumberFormatException a) {

                System.out.println("El valor introducido, no es valido.");

            }

        } while (!devuelveValor);

        return valorEntero;

    }
    
    
    /*
    Desc: Solicita al usuario que introduzca un valor Double. La funcion controla que el valor es correcto o devuelve un error. 
    Input: La funcion recibe un String con el texo que se mostrará al usuaio
    Output: La funcion devulve un valor Double, una vez comprobado que el valor es correcto.
    */
    
    
    public static double pideDouble(String pregunta) {

    Double valorDouble = 0.000000;

    boolean devuelveValor = false;

    System.out.println(pregunta);

    Scanner myObj = new Scanner(System.in);

    do {

        try {

            valorDouble = Double.parseDouble(myObj.nextLine());

            devuelveValor = true;

        } catch (NumberFormatException a) {

            System.out.println("El valor introducido, no es valido. Introduzca un numero con formato '0.0000...'");
        }

    } while (!devuelveValor);

    return valorDouble;

    }

}
