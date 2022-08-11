/*  Ejercicio 14 bloque 2
Hacer un programa que pase de Kg a otra unidad de medida de masa , mostrar en pantalla un menu con las 
opciones posibles.
*/
package com.mycompany.condicionales;

import javax.swing.JOptionPane;

public class Condicionales {

    public static void main(String[] args) {
        float medida;
        int opcion;
        
        medida = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de kg"));
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion del menu\n"
        +"1. Hectogramos\n" 
        +"2. Decagramos\n"
        +"3. Gramos\n"
        +"4. Decigramos\n"
        +"5. Centigramos\n"
        +"6. Miligramos\n"));
        
        switch (opcion) {
            case 1: medida *=10;
                    JOptionPane.showMessageDialog(null, "La nueva medida en hectogramos es: " +medida);
                    break;
            case 2: medida *= 100;
                    JOptionPane.showMessageDialog(null, "La nueva medida en decagramos es: " +medida);
                    break;
            case 3: medida *= 1000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en gramos es: " +medida);
                    break;
            case 4: medida *= 10000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en decigramos es: " +medida);
                    break;
            case 5: medida *= 100000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en centigramos es: " +medida);
                    break;
            case 6: medida *= 1000000;
                    JOptionPane.showMessageDialog(null, "La nueva medida en miligramos es: " +medida);
                    break;
            default: JOptionPane.showMessageDialog(null,"ERROR");break;
        }
    }
}
    
