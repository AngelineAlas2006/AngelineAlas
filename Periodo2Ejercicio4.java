import java.util.Scanner;

public class Unidad2Semana6Clase17Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar = 0;
        int sumimpar = 0;
        System.out.println("Introduce número");
        num = teclado.nextInt();
        for(int ind = 1; ind <= num; ind++){
            if(ind % 2 == 0){
                supar += ind;
            }
            else {
                sumimpar += ind;
            }
        }
        System.out.println("La suma de los pares es: " + supar);
        System.out.println("La suma de los imapres es: " + sumimpar);
    }
    
}