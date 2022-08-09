// Incrementos y decrementos 

public class Main
{
	public static void main(String[] args) {
		int x = 5, y;
		
		x++;  // x = x + 1;  x += 1;
	  //x--;
		
		y = ++x;
	  //y = --x
		
		System.out.println(y);  //con y = x++ , para que dé y = 11 se debe asignar como prefijo ++x;
		System.out.println(x);
	}
}

// y = x++ primero hace la asignacion y luego incrementa x, no queda reflejado el incremento  en y
// y = ++x primero hace el incremento y luego hace la asignacion a 'y' ,queda reflejado el valor inc.
