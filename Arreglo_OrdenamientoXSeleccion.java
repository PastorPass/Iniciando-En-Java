/* METODO PARA ORDENAR LOS ELEMENTOS DE UN ARREGLO

Metodo de ordenamiento por seleccion
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[], nElementos, min,aux;
        
        System.out.println("Ingrese la cantidad de elementos para el arreglo");
        nElementos = entrada.nextInt();
        
        //Le asignamos el numero de elementos al arreglo
        arreglo = new int[nElementos];
        
        
        //Cargamos el arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por seleccion
        for (int i = 0; i < nElementos; i++) {
            min = i;
            for (int j = i+1; j < nElementos; j++) {
                if(arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        
        //Mostrando el arreglo ordenado en forma creciente (con for each)
        
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
