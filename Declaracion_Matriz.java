/* MATRIZ- DECLARACION DE FORMA MANUAL Y POR TECLADO
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    /*
	    DE FORMA MANUAL
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i <3; i++) {  //numero de filas
            for (int j = 0; j < 3; j++) {       //numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        */
        
        int matriz[][], nFilas,nColumnas;
        System.out.println("Ingrese la cantidad de filas a la matriz");
        nFilas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de columnas a la matriz");
        nColumnas = entrada.nextInt();
        
        matriz = new int [nFilas][nColumnas];
        
        System.out.println("Ingrese la matriz");
          for (int i = 0; i <nFilas; i++) {  //numero de filas
            for (int j = 0; j < nColumnas; j++) {       //numero de columnas
                System.out.print("matriz{"+i+"}{"+j+"}: ");
                matriz[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        //Impresion de la matriz
        
        for (int i = 0; i <nFilas; i++) {  //numero de filas
            for (int j = 0; j < nColumnas; j++) {       //numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
	}
}
