import java.util.Scanner;
  public class Unidad2Semana6Clase18Ejercicio6 {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int n = 1; n <= 10; n++){
            int f = 1;
            for(int i = 2; i <= n; i++){
                f *= 1;
            }
            System.out.print("El factorial de: " + n);
            System.out.println(" es: " + f);
        }
    }
    
}