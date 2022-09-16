import java.util.Scanner;
import javax.swing.JOptionPane;

      public class Unidad2Semana5Clase15Ejercicio1 {
      
        public static void main(String[] args) {
        double area, descuento, preciototal = 10000, total;
        Scanner entrada = new Scanner(System.in);
        area = entrada.nextDouble();
        int valor = 0;
        if (area > 400 && area < 500){
            valor = 1;
        } else if (area > 500 &&area < 1000){
            valor = 2;
        } else if (area > 1000){
            valor = 3;
        }
        switch(valor){
            case 1:
                descuento = preciototal * .10;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 10%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            case 2:
                descuento = preciototal * .17;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 17%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            case 3:
                descuento = preciototal * .25;
                total = preciototal - descuento;
                JOptionPane.showMessageDialog(null, "Se aplica un descuento de 25%");
                JOptionPane.showMessageDialog(null, "El precio es de: " + total);
                break;
            default:
                System.out.println("Tu terreno no aplica a descuento");
                break;
        }
    }
    
}