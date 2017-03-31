
package burbujasimple;

import java.util.Scanner;

/**
 *
 * @author Orlando
 */
public class BurbujaSimple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Esto sirve para leer entradas de consola
        System.out.println("¿Cuantos numeros vas a ordenar?");
        
        int capacidad = sc.nextInt();
        int [] numeros = new int[capacidad];
        //Creamos un arreglo que guardara todos los numeros a ordenar
        for(int i = 0; i < capacidad; i++) {
            System.out.println("Ingresa el numero " + 
                    (i+1));
            numeros[i] = sc.nextInt();
        }
        
        Ordenar ord = new Ordenar();
        ord.ordenar(numeros);
        
        String salida [] = ord.obtenerOrden();
        
        System.out.println(salida[0]);
        System.out.println(salida[1]);
  
    }
    
}
