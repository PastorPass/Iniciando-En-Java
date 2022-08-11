/*  Ejercicio 12 bloque 2
Pedir una nota de 0 a 10 y mostrarla de la forma : Insuficiente, suficiente, Bien, Notable y Sobresaliente.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota de 0 a 10"));
        
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4 : JOptionPane.showMessageDialog(null, "tu nota fue de Insuficiente");break;
            case 5: JOptionPane.showMessageDialog(null, "tu nota fue de Suficiente");break;
            case 6: JOptionPane.showMessageDialog(null, "tu nota fue de Bien");break;
            case 7: 
            case 8: JOptionPane.showMessageDialog(null, "tu nota fue de Notable");break;
            case 9: 
            case 10: JOptionPane.showMessageDialog(null, "tu nota fue de Sobresaliente");break;
            default : JOptionPane.showMessageDialog(null, "ERROR");
        }
        
        /*
        
        if(nota <=4) {
            JOptionPane.showMessageDialog(null,"Tu nota fue de insuficiente");
        }
        else if(nota == 5) {
            JOptionPane.showMessageDialog(null,"Tu nota fue de Aprobado");
        }
        else if (nota == 6) {
            JOptionPane.showMessageDialog(null,"Tu nota fue de Bien");
        }
        else if((nota >6) && (nota <9)) {
            JOptionPane.showMessageDialog(null,"Tu nota fue de Notable");
        }
        else if(nota >= 9) {
            JOptionPane.showMessageDialog(null,"Tu nota fue sobresaliente");
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        */
    }
}
    
