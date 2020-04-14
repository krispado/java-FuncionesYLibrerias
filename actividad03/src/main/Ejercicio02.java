package main;

import actividad03.Ejercicio01;
import actividad03.introduceDatos.Pregunta;
import java.io.IOException;
import operaciones.valores;


/*
Desc: Clase publica que contiene la funcion Main del Ejercicio2
Input: N/A
Output: N/A
 */

public class Ejercicio02 {

    /*
    Desc: Funcion principal del Ejercicio2. Contiene el Menú de usuario
    Input: N/A
    Output: N/A
     */
    
    public static void main(String[] args) throws IOException {

        int valor;

        do {

            Ejercicio01.limpiarPantalla();

            System.out.println("----------------------------------------");
            System.out.println("|         Menu de Opciones             |");
            System.out.println("----------------------------------------");
            System.out.println("| 1.- Mostrar el valor de PI           |");
            System.out.println("| 2.- Valor aleatorio                  |");
            System.out.println("| 3.- Calcula el logaritmo en base (E) |");
            System.out.println("| 4.- Elevar una base a una potencia   |");
            System.out.println("| 5.- Calcula la raiz cuadrada         |");
            System.out.println("| 6.- Calcula la raiz cuadrada         |");
            System.out.println("|                                      |");
            System.out.println("| 0.- Salir                            |");
            System.out.println("----------------------------------------");

            valor = Pregunta.piderEntero("Introduzca el numero de una opcion valida");

            switch (valor) {

                case 1:

                    Ejercicio01.limpiarPantalla();

                    System.out.println("******************************************************************");
                    System.out.println("El valor de PI es: " + valores.muestraPi());
                    System.out.println("******************************************************************");

                    Ejercicio01.pausa();

                    break;

                case 2:

                    Ejercicio01.limpiarPantalla();

                    int numeroMaximo = Pregunta.piderEntero("Introduce el numero maximo:");

                    int numeroAleatorio = valores.muestraValorAleatorio(numeroMaximo);

                    System.out.println("******************************************************************");
                    System.out.println("El numero aleatorio es: " + numeroAleatorio);
                    System.out.println("******************************************************************");

                    Ejercicio01.pausa();

                    break;

                case 3:

                    Ejercicio01.limpiarPantalla();

                    double algoritmoBaseEDe = Pregunta.pideDouble("Introduce el numero del que quieres calcular el logaritmo en base E: ");

                    double resultadoAlgoritmoBaseEDe = operaciones.aritmeticas.Operaciones.resultadoLogaritmo(algoritmoBaseEDe);

                    System.out.println("******************************************************************");
                    System.out.println("El logaritmo de " + algoritmoBaseEDe + " en base E es " + resultadoAlgoritmoBaseEDe);
                    System.out.println("******************************************************************");

                    Ejercicio01.pausa();

                    break;

                case 4:

                    Ejercicio01.limpiarPantalla();

                    double base = Pregunta.pideDouble("Introduce el numero base:");

                    double potencia = Pregunta.pideDouble("Introduce la potencia");

                    double resultado = operaciones.aritmeticas.Operaciones.calculaPotencia(base, potencia);

                    System.out.println("******************************************************************");
                    System.out.println("El numero " + base + " elevado a " + potencia + " es igual a " + resultado);
                    System.out.println("******************************************************************");

                    Ejercicio01.pausa();

                    break;

                case 5:

                    Ejercicio01.limpiarPantalla();

                    double numeroACalcularRaiz = Pregunta.pideDouble("Introduce el numero del que quieres calcular la raiz cuadrada:");

                    double resultado_raiz = operaciones.algebraicas.Operaciones.muestraRaizCuadrada(numeroACalcularRaiz);

                    System.out.println("******************************************************************");
                    System.out.println("La raiz de " + numeroACalcularRaiz + " es " + resultado_raiz);
                    System.out.println("******************************************************************");

                    Ejercicio01.pausa();

                    break;

            }

        } while (0 != valor);

    }

}
