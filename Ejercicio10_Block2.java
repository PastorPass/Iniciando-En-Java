/*  Ejercicio 10 bloque 2
Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.  Con meses de 28 30 y 31 dias.
Sin años biciestos.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        int dia,mes,año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        
        if(año == 0) {
            JOptionPane.showMessageDialog(null, "fecha incorrecta");
        }
        else if((mes ==2) && (dia >=1) && (dia <= 28)) {
            JOptionPane.showMessageDialog(null, "fecha correcta");
        }
        else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >=1) && (dia <=30)){  //OPERADOR OR = | (alt + 1)
            JOptionPane.showMessageDialog(null, "fecha correcta");            
        }
        else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes ==10 || mes==12) && (dia >=1) && (dia <=31)) {
            JOptionPane.showMessageDialog(null, "fecha correcta");                        
        }
        else {
            JOptionPane.showMessageDialog(null, "fecha incorrecta");
        }
    }
}
    
