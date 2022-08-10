/*  Ejercicio 4 bloque 2
En un shopping se hace un 20% de descuento a los clientes cuya compra supera los 300$, cual sera la
cantidad que pagará una persona por su compra? .
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        float precio,descuento ;

        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un precio"));
        
        if(precio > 300) {
            descuento = (precio*20)/100;
            precio -= descuento;
            JOptionPane.showMessageDialog(null,"El total a pagar(con descuento) es " + precio);
        }
        else {
            JOptionPane.showMessageDialog(null, "Se debe pagar (sin descuento):" + precio);
        }
    }
}
