/*  Ejercicio 5 bloque 2
Un obrero necesita calcular su salario semanal , el cual se obtiene de la siguiente manera :
ºSi trabaja 40 horas o menos se le paga $16 por hora.

ºSi trabaja mas de 40 hs se le paga $16 por cada una de las primeras 40 hs y $20 por cada hora extra.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int horasTrabajadas,totalPago = 0;  // se debe inicializar la variable totalPago

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las hs trabajadas"));
        
        if(horasTrabajadas > 40) {
            
            //Para calcular el pago que se le debe hacer por las hs extra.
            //forma mas abreviada
            totalPago = 40*16 + ((horasTrabajadas -40)*20);
            
            /* Primera forma que hice.
            extra = horasTrabajadas - 40;
            extra *= 20;
            totalPago = pago + extra;
            */
        }
        else if (horasTrabajadas <= 40){
            totalPago = horasTrabajadas *16;
        }
        JOptionPane.showMessageDialog(null,"el pago total que recibe es : " + totalPago);
    }
}
    
