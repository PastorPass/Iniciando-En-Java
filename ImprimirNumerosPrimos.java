// Armar un programa que muestre los 100 primeros numeros primos



import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
/**
 *
 * @author pastor
 */
public class Main {

    public static void main(String[] args) throws IOException {
        
        String resultadoTotal = "";  // variable donde vamos a mostrar todos los numeros primos
        
        int ContadorPrimos = 0;  //contador de numeros primos encontrados
        int numero = 1;  // se va analizando desde el numero 1 a ver si es primo o no
        
        while (ContadorPrimos < 100) {
            if(EsPrimo(numero)) {
                resultadoTotal += numero + ", ";
                ContadorPrimos++;
            }
            numero++;
        }
        
        System.out.println("los primeros 100 numeros primos son " + resultadoTotal);
    }
    
    private static Boolean EsPrimo (Integer numero) {
   
        Boolean EsUnNumPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if(numero % i == 0) {
                EsUnNumPrimo = false;
            }
        }
        
       return EsUnNumPrimo;
    }
}
