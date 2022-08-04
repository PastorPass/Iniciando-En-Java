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
        
        Integer numero = 10;
        Boolean EsPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if(numero % i == 0) {
                EsPrimo = false;
            }
        }
        
        if(EsPrimo) {
            System.out.println("ES PRIMO");
        }
        else  {
            System.out.println("NO ES PRIMO");
        }
    }
}
