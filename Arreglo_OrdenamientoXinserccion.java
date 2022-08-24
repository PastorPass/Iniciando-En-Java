/* METODO PARA ORDENAR LOS ELEMENTOS DE UN ARREGLO

Metodo de ordenamiento por inserccion
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[], nElementos, pos,aux;
        
        System.out.println("Ingrese la cantidad de elementos para el arreglo");
        nElementos = entrada.nextInt();
        
        //Le asignamos el numero de elementos al arreglo
        arreglo = new int[nElementos];
        
        
        //Cargamos el arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ordenamiento por inserccion
        for (int i = 0; i < nElementos; i ++) {
            pos = i;
            aux = arreglo[i];
            
            while ((pos >0 ) && (arreglo[pos-1]) > aux) {
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
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
