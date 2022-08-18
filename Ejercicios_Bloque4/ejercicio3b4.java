/* Ejercicio 3 bloque 4
Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los 
numeros positivos, la media de los negativos y contar el numero de ceros.
*/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    final int tope = 5;
		float[] arreglo = new float[tope];
		int cantCeros = 0,contadorPos = 0,contadorNeg = 0;
		float sumaNumPos = 0,sumaNumNeg = 0;
		
		//Carga de elementos al arreglo
		for (int i = 0; i <5; i++) {
		    System.out.println("Ingrese un numero");
		    arreglo[i] = entrada.nextFloat();
		    if(arreglo[i] >0) {
		        sumaNumPos += arreglo[i];
		        contadorPos++;
		    }
		    else if(arreglo[i] == 0) {
		        cantCeros++;
		        
		    }
		    else {
		      sumaNumNeg += arreglo[i];
		      contadorNeg++;
		    }
		}
		
		//Informe 
		if (contadorPos != 0) {
		    System.out.println("La media de los numeros positivos : " +sumaNumPos/contadorPos);
		}
		if (contadorNeg != 0) {
		    System.out.println("La media de los numeros negativos : " +sumaNumNeg/contadorNeg);
		}
		System.out.println("La cantidad de numeros cero : " +cantCeros);
	   
	}
}