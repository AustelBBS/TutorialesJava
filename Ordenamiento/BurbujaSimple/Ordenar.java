
package burbujasimple;

/**
 *
 * @author Orlando
 */
class Ordenar {
    
    private String salida [];
    
    public Ordenar()
    {
        //Esto sirve para dar formato a la salida 
        salida = new String[]{"Numeros ingresados: ", "Numeros ordenados: "};
    }
    
    public void ordenar(int[] numeros) {
        System.out.println("Ordenando...");
        //Tomando la entrada original
        for(int n: numeros)
            salida[0] += n + ", ";
        //ordenando
        for(int i = 1; i < numeros.length; i++)
        {
            for(int j = 0; j < numeros.length-1; j++)
                if( numeros[j] > numeros[j+1])
                {
                        int temp = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = temp;
                }
        }
        //Tomando la salida ordenada
        for(int n: numeros)
            salida[1] += n + ", ";
    }
    
    //Veamos una prueba
    public String[] obtenerOrden() {
        //retornar los arreglos
        return salida;
    }
    

}
