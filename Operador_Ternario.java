//EL OPERADOR TERNARIO
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //OPERADOR TERNARIO Se usa '?' y ':'
        // Si (numero%2) = 0 osea si es verdadero guarda la cadena (string) "Es Par" en la variable mensaje
        // si numero%2 <> 0 guarda "Es Impar" en la variable mensaje. 
        mensaje = (numero%2 == 0) ? "ES PAR " : "ES IMPAR";
        JOptionPane.showMessageDialog(null, mensaje);
        
        //De una forma mas acotada (sin la variable mensaje) y sacando la linea 17 pegandola en la 18 : y sacando "mensaje ="
       // JOptionPane.showMessageDialog(null,(numero%2 == 0) ? "ES PAR " : "ES IMPAR");
    }
}
