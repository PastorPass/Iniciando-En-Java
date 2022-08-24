/* METODO PARA ORDENAR LOS ELEMENTOS DE UN ARREGLO

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[], nElementos, aux;
        
        System.out.println("Ingrese la cantidad de elementos para el arreglo");
        nElementos = entrada.nextInt();
        
        //Le asignamos el numero de elementos al arreglo
        arreglo = new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }
        
        //METODO BURBUJA
        
        for(int i = 0; i < (nElementos-1); i++) {
            for (int j = 0; j < (nElementos-1); j++) {
                if (arreglo[j] > arreglo[j+1]) {        // Si numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }                  
            }
            
        }
        
        //Mostrando el arreglo ordenado en forma creciente
        
        System.out.println("---------------------------------------------");
        for (int k : arreglo) {
            System.out.println(k);
        }
        
        //Mostrando el arreglo en forma decreciente
        System.out.println("---------------------------------------------");
        for (int i = (nElementos-1) ; i>= 0; i--) {
            System.out.println(arreglo[i]);
        }
	}
}
