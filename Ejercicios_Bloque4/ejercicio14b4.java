/* Ejercicio 14 bloque 4
Leer dos series de 10 numeros enteros, que estaran ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {

    final int tope = 10;
    	Scanner entrada = new Scanner(System.in);
	    int a[],b[],c[];
	    
	    boolean creciente = true;
	    a = new int [tope];
	    b = new int [tope];
	    c = new int [20];
		
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
	    
	    //Carga del 2do arreglo
	    do {
	        for (int i = 0; i < tope; i++) {
	            System.out.println("Ingrese un numero");
	            b[i] = entrada.nextInt();
	        }
	        
	        //Comprobamos si el arreglo esta ordenado
	        for (int i = 0; i < 9; i++) {
	            if(b[i] < b[i+1]) {
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
	    
	    // Iteradores
	   int i = 0;   // iterador para el arreglo a
	   int j = 0;   // iterador para el arreglo b
	   int k = 0;   // iterador para el arreglo c
	   
	   while (i < tope && j < tope) {
	       if (a[i] < b[j]) {       // Si el elemento de a es menor que el elemento de b
	           c[k] = a[i];         // Copiamos el elemento de a
	           i++;                 //Avanzamos una posicion de a
	       }else {
	           c[k] = b[j];
	           j++;
	       }
	       k++;         //Avanzamos una posicion en c
	   }
	   
	   //Cuando salimos del while es porque un arreglo (a o b) se ha copiado completamente
	   if (i == 10) {  //Significa que ya copiamos todo el arreglo a, falta el b
	       while(j < tope) {
	           c[k] = b[j];
	           j++;
	           k++;
	       }
	   }
	   else {   // Significa que ya copiamos todo el arreglo b, falta el a
	       while (i < tope) {
	           c[k] = a[i];
	           i++;
	           k++;
	       }
	   }
	   
	   System.out.println("El arreglo queda");
	   for (k = 0; k < 20; k++){
	       System.out.println("posicion " + k+" elemento = " +c[k]);
	   }
	}
}
