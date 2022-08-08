
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        char letra;
        
        System.out.print("Digite una letra : ");
        letra = entrada.nextLine().charAt(0); 
        
        System.out.println("La letra es " + letra);
        
    }
}

// Cambiando solo el tipo de dato a ser leido --> por ejemplo:  String cadena; y modificando la entrada
//entrada.nextDouble  >> Para tipos de datos decimales con coma de 64 bits (se guarda con coma no con .)
//entrada.nextFloat  >> para tipo de datos decimales con coma de 32 bits, (se guarda con coma no con .)
//entrada.nextLine().charAt(0) --> Para tipos char y para que solo admita el primer caracter o digito

//Con string -->
// usando .next te guarda la cadena hasta encontrar un espacio
//usando .nextLine te guarda toda la cadena.