/*  Ejercicio 9 bloque 2
Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses
son de 30 dias.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        
        if((dia >=1) && (dia <= 30)) {
            if((mes >=1) && (mes<=12)) {
                if(año != 0) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
        
        /*
        //De otra manera
        if((((dia >=1) && (dia <=30)) && ((mes >=1) && (mes <=12)) && (año != 0))) {
            JOptionPane.showMessageDialog(null, "Fecha correcta");
        }
        else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta");
        }
        */
         
    }
}
    
