/* METODO PARA BUSCAR UN ELEMENTO DETERMINADO EN EL ARREGLO
BUSQUEDA SECUENCIAL
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[];
        int dato,nElementos;
        boolean ok = false;
        
        System.out.println("Ingrese la cantidad de elementos para el arreglo");
        nElementos = entrada.nextInt();
        
        //Le asignamos el numero de elementos al arreglo
        arreglo = new int[nElementos];
        
        //Cargamos el arreglo
        for (int i = 0; i < nElementos; i++) {
            System.out.println("Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }
        
        //Ingresamos el numero a buscar en el arreglo
        System.out.println("Ingrese el numero a buscar en el arreglo");
        dato = entrada.nextInt();
        
        
        //Busqueda Secuencial
        
        int i = 0;
        while (i <nElementos && ok == false) {
            if(arreglo[i] == dato) {
                ok = true;
            }
            i++;
        }
        
        if (ok == false) {
            System.out.println("No se ha encontrado el numero " + dato + " en el arreglo");
        }
        else {
            System.out.println("El numero " + dato + " ha sido encontrado en la posicion: "+(i-1));
            
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
