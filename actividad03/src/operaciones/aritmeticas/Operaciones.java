package operaciones.aritmeticas;

/*
Desc: Clase publica que contiene las funciones con operacion aritmeticas.
Input: N/A
Output: N/A
*/

public class Operaciones {
    
    /*
    Desc: Funcion que calcula el logaritmo en base E de un resultado dado.
    Input: Valor como Double que indica el resultado del logaritmo.
    Output: Valor como Double que indica a que numero debe exponerse E para obtener el resultado dado.
    */
    
    public static double resultadoLogaritmo(double algoritmoBaseEDe){
        
        double logaritmo = Math.log(algoritmoBaseEDe);
    
        return logaritmo;
        
    }
    
    /*
    Desc: Funcion que calcula el resultado de expone un numero dado a otro.
    Input: Dos valores como Double que representan la base y la potencia.
    Output: Un vaor double como resultado de exponer la base a la potencia.
    */
    
    public static double calculaPotencia (double base, double potencia){
    
        double resultado = Math.pow(base, potencia);
    
        return resultado;
        
    }
    
}
