// Clase Math

public class Main
{
	public static void main(String[] args) {
	    
	    //Metodo para sacar la raiz cuadrada de un numero
        //Este metodo funciona solo con tipos double y devuelve un tipo double.
		double raiz = Math.sqrt(9);  // saca la raiz cuadrada de '9'
		
		//Para transformarlo a int. (entero)
		//int raiz = (int)Math.sqrt(9);
		
		
		//Metodo para calcular la potenciacion de un numero elevado a una base 'x' y un exponente 'x' 
		double base = 5, exponente = 2;
		double resultado = Math.pow(base, exponente); 
		
		
		//Metodo para redondear un numero
		//con tipo double a long 
		double numero = 4.67;
		long result = Math.round(numero);
		
		// --> Con tipo float a int 
	//	float numero = 4.33f;
	//	int result = Math.round(numero);
		
		
		//Metodo para recibir un numero aleatorio(en double);
		
		double num = Math.random();
		
		System.out.println(raiz);
		System.out.println(resultado);
		System.out.println(result);
		System.out.println(num);


	}
}

