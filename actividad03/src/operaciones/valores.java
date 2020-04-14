package operaciones;

/*
Desc: Clase publica que contiene las funciones matematicas.
Input: N/A
Output: N/A
*/

public class valores {
    
    /*
    Desc: Funcion que devulve el numero PI
    Input: Nada.
    Output: valor de PI como Double.
    */
    
    public static double muestraPi(){
    
        double pi = Math.PI;
    
        return pi;
    }
    
    /*
    Desc: Funcion que genera un numero aleatorio entre 0 y el valor introducido por el usuario.
    Input: Integer que indica el valor maximo del numero aleatorio
    Output: Integer con el numero aleatorio.
    */
    
    public static int muestraValorAleatorio (int valorMaximo){
    
        int numeroAleatorio = (int) Math.floor(Math.random()*(valorMaximo +1 ));
    
    return numeroAleatorio;
    };
    
}
