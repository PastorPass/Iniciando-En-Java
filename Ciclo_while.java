//USO DEL WHILE.
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i = 1,contador;  // se debe inicializar la variable iteradora i.
		
		System.out.println("Ingrese cuantos numeros quiere en pantalla");
		contador = entrada.nextInt();
		
		while (i <= contador) {
		   System.out.println(i);
           i++;
		}
	}
}
