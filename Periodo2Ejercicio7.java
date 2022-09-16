import java.util.Scanner;

  public class Unidad2Semana8Ejercicio7 {
    public static void main(String[]args) {
    Scanner datos= new Scanner(System.in);
    int valor;
    do {
      System.out.print("ingrese un valor entre 0 y 999 (0 finaliza):");
      valor=datos.nextInt();
      if (valor>=100) {
        System.out.println("es de 3 digitos.");
      } else {
        if (valor>=10) {
          System.out.println("es de 2 digitos.");
        } else {
          System.out.println("es de 1 digito.");
        }
      }
    } while (valor !=0);
  }
}