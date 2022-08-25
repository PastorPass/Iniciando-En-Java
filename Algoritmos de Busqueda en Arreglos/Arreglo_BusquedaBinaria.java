/* METODO PARA BUSCAR UN ELEMENTO DETERMINADO EN EL ARREGLO
BUSQUEDA BINARIA -El arreglo debe estar ordenado en forma creciente
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = {1,2,3,4,5};  // arreglo ya cargado
        int inf,sup,mitad,i,dato;
        boolean ok = false;
        
        //Ingresamos el numero a buscar en el arreglo
        System.out.println("Ingrese el numero a buscar en el arreglo");
        dato = entrada.nextInt();
        
        
        //Busqueda Binaria
        
        inf = 0;
        sup = 5;   // cantidad de elementos del arreglo
        i = 0;
        
        mitad = (inf+sup) /2;
        
        while (inf <= sup &&  i<5) {
            if (arreglo[mitad] == dato) {
                ok = true;
                break;
            }
            if (arreglo[mitad] >dato) {
                sup = mitad;
                mitad = (inf+sup) /2;
            }
            if (arreglo[mitad] < dato) {
                inf = mitad;
                mitad = (inf+sup) /2;
            }
            i++;
        }
        
        if (ok == true) {
            System.out.println("El numero, " + dato + " ha sido encontrado en la posicion: " + mitad);
        }
        else {
            System.out.println("No hemos encontrado el numero, " + dato + " en el arreglo");

        }
        
        /*
        //Mostrando el arreglo ordenado en forma creciente (con for each)
        
        System.out.println("---------------------------------------------");
        for (int k : arreglo) {
            System.out.println(k);
        }
        
        //Mostrando el arreglo en forma decreciente
        System.out.println("---------------------------------------------");
        for (int j = (nElementos-1) ; j>= 0; j--) {
            System.out.println(arreglo[j]);
        }
        */
	}
}
