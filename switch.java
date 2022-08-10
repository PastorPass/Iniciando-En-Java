//Uso del SWITCH  (como el case en pascal)
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int dato;

        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        switch (dato) {
            case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
                    break;  // se debe poner break para que salga de la condicion.
            case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "El numero no esta en el rango 1-5");
                     break;  // el break del default es opcional, pero se recomienda usarlo.
        }

    }
}

    
