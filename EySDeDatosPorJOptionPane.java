COMPILADO CON NEATBEANS



import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String cadena;
        int entero;
        double decimal;
        char letra;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);

        JOptionPane.showMessageDialog(null, "La cadena es : " + cadena);
        JOptionPane.showMessageDialog(null, "El numero es : " + entero);
        JOptionPane.showMessageDialog(null, "El decimal es : " + decimal);
        JOptionPane.showMessageDialog(null, "La letra es : " + letra);

    }
}