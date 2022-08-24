/* Ejercicio 15 bloque 4
Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla, se debe mostrar
la posicion en la que se encuentra. Si no está, indicarlo con un mensaje.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    final int tope = 10;
    	Scanner entrada = new Scanner(System.in);
	    int a[];
	    int N;
	    
	    boolean creciente = true;
	    a = new int [tope];
		
	    //Carga de elementos al primer arreglo.
	    do {
	        for (int i = 0; i < tope; i++) {
	            System.out.println("Ingrese un numero");
	            a[i] = entrada.nextInt();
	        }
	        
	        //Comprobamos si el arreglo esta ordenado
	        for (int i = 0; i < 9; i++) {
	            if(a[i] < a[i+1]) {
	                creciente = true;
	            }
	            else {
	                creciente = false;
	                break;
	            }
	            
	            
	        }
	        if (creciente == false) {
	                System.out.println("El arreglo esta desordenado");
	        }
	    }while (creciente == false);
	       
	    System.out.println("------------------------------------");
	    
	    System.out.println("Ingrese numero N a buscar en la tabla");
	    N = entrada.nextInt();
	    
	    //Buscamos el numero en el arreglo
	    int i = 0;
	    while (i < tope && a[i] < N) {
	        i++;
	    }
	    
	    if (i == 10) {
	        System.out.println("Numero " + N+ "No encontrado en la tabla");
	    }
	    else {
	        if(a[i] == N) {
	            System.out.println("La posicion del numero " + N + " En la tabla es : " + i);
	        }
	        else {
	        System.out.println("Numero no encontrado");
	        }
	    }
	    
	    
	    /*  Esta manera de buscar con un for es muy poco eficiente y se considera un error de implementacion
	    int pos = -1;
	    for(int i = 0; i < tope; i++) {
	        if (a[i] == N) {
	            pos = i;
	        }
	    }

	    if(pos != -1) {
	        System.out.println("La posicion en la que se encontró " + N + "E s la pos nro:" +pos);
	    }
	    else {
	        System.out.println("No se encuentra el nro " + N + "En la tabla");
	    }
	    */
	   
	   /*
	   
	   System.out.println("El arreglo queda");
	   for (int i = 0; i < tope; i++){
	       System.out.println("posicion " + i+" elemento = " +a[i]);
	   }
	   */
	}
}
