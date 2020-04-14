package actividad03;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {
    
/*
Desc: Función principal del programa
Input: 
Output: Nada
*/

    public static void main(String[] args) throws IOException {

        int valorMenu;
        boolean avanzar = false;

        limpiarPantalla();

        do {
            System.out.println(" * * *  M E N U * * * ");
            System.out.println("");
            System.out.println("1.- Calcula el mayor de tres numeros");
            System.out.println("2.- Calcula del dia de la semana");
            System.out.println("3.- Supera el 50");
            System.out.println("");
            System.out.println("4.- Salir de la app");

            valorMenu = pideEntero("Selecciona una opción");

            switch (valorMenu) {

                case 1:
                    limpiarPantalla();
                    System.out.println("**************");
                    System.out.println("** OPCION 1 **");
                    System.out.println("**************");

                    int valorMaximo = maximoDeTresValores();

                    System.out.println("**********************************************");
                    System.out.println("*** El valor maximo introducido es: " + valorMaximo + "    ***");
                    System.out.println("**********************************************");
                    System.out.println("");
                    pausa();
                    limpiarPantalla();
                    break;

                case 2:

                    limpiarPantalla();
                    System.out.println("**************");
                    System.out.println("** OPCION 2 **");
                    System.out.println("**************");

                    int diaDeLaSemana;

                    do {

                        diaDeLaSemana = pideEntero("Introduce un valor entre 1 y 7");

                        if (diaDeLaSemana <= 7) {

                            avanzar = true;

                        } else {

                            System.out.println("El valor introducido debe ser menor o igual a 7");

                        }

                    } while (!avanzar);

                    avanzar = false;

                    System.out.println("***************************************************************************************");
                    System.out.println("*** El valor " + diaDeLaSemana + " se corresponde con el dia de la semana " + calculaDiaSemana(diaDeLaSemana));
                    System.out.println("***************************************************************************************");
                    System.out.println("");

                    pausa();

                    limpiarPantalla();

                    break;

                case 3:

                    limpiarPantalla();
                    System.out.println("**************");
                    System.out.println("** OPCION 3 **");
                    System.out.println("**************");

                    double numeroMayorQueCincuenta = 0.00;
                    int intentos = 1;
                    avanzar = false;

                    do {

                        numeroMayorQueCincuenta = pideDouble("Introduce un valor mayor que 50");

                        if (numeroMayorQueCincuenta > 50.00) {

                            avanzar = true;

                        } else {

                            intentos++;

                        }

                    } while (!avanzar);

                    avanzar = false;

                    System.out.println("***************************************************************************************");
                    System.out.println("*** Felicidades, has intorducido un valor " + numeroMayorQueCincuenta + " que es mayor de 50 en " + intentos + " intetento ***");
                    System.out.println("***************************************************************************************");
                    System.out.println("");
                    pausa();
                    limpiarPantalla();

                    break;

            }

        } while (4 != valorMenu);

    }
    
    /*
    Desc: Solicita al usuario que introduzca un valor Integer. La funcion controla que el valor es correcto o devuelve un error. 
    Input: La funcion recibe un String con el texo que se mostrará al usuaio
    Output: La funcion devulve un valor Integer, una vez comprobado que el valor es correcto.
    */
    
    public static int pideEntero(String mensaje) {

        int valorEntero = 0;

        boolean devuelveValor = false;

        do {

            try {

                System.out.println(mensaje);

                Scanner myObj = new Scanner(System.in);

                valorEntero = Integer.parseInt(myObj.nextLine());

                devuelveValor = true;

            } catch (NumberFormatException a) {

                System.out.println("El valor introducido, no es valido. introduzca un numero");

            }

        } while (!devuelveValor);

        return valorEntero;

    }

    /*
    Desc: Solicita al usuario que introduzca un valor Double. La funcion controla que el valor es correcto o devuelve un error. 
    Input: La funcion recibe un String con el texo que se mostrará al usuaio
    Output: La funcion devulve un valor Double, una vez comprobado que el valor es correcto.
    */
    
    public static double pideDouble(String mensaje) {

        Double valorDouble = 0.000000;

        boolean devuelveValor = false;

        System.out.println(mensaje);

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
        
    /*
    Desc: La funcion comprar tres valores introducdos por el usuario para calcual cual es el mayor.
    Input: Nada
    Output: La funcion devulve el mayor de los numeros como un Integer.
    */
        
    public static int maximoDeTresValores() {

        int[] arrayDeEnteros = new int[3];
        int valorMaximo = 0;

        for (int i = 0; i < 3; i++) {

            arrayDeEnteros[i] = pideEntero("Introduce el valor " + (i + 1) + " de los valores a comparar");

            if (i == 0) {
                valorMaximo = arrayDeEnteros[i];
            } else {

                if (valorMaximo < arrayDeEnteros[i]) {
                    valorMaximo = arrayDeEnteros[i];
                }

            }

        }

        return valorMaximo;

    }
    
    /*
    Desc: La funcion calcula el dia de la semana en base al valor introducdo por el usuario.
    Input: La funcion recibe un valor Integer entre uno y siete.
    Output: La funcion devuelve un String con el valor del dia de la semana.
    */
    
    public static String calculaDiaSemana(int diaSemana) {

        String[] dias = {"Lunes",
            "Martes",
            "Miércoles",
            "Jueves",
            "Viernes",
            "Sábado",
            "Domingo"};

        String nombreDia = dias[diaSemana - 1];

        return nombreDia;
    }
    
    /*
    Desc: La funcion introduce 100 lineas en blanco, creando la sensacion de limpiar la pantalla.
    Input: Nada.
    Output: Nada.
    */
    
    public static void limpiarPantalla() {

        for (int i = 0; i < 100; i++) {

            System.out.println("");

        }

    }
        
    /*
    Desc: La función pausa la ejecucion del programa para que el usuario lea el resultado. Continua la ejecucion al pulsar Intro.
    Input: Nada.
    Output: Nada
    */

    public static void pausa() throws IOException {

        System.out.println("Presione intro para volver al menú...");
        System.in.read();
    }
}
