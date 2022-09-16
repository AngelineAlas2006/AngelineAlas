import java.util.Scanner;

public class Unidad3Clase15Ejercicio7 {
    public static void main(String[] args) {
        int edad, suma = 0, contador = 0, promedio = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Ingrese la edad de la persona: ");
            edad = teclado.nextInt();
            suma = suma + edad;
            contador = contador + 1;
            promedio = suma / contador;
            System.out.println("El promedio de ahora es " + promedio);
            if (promedio > 25){
                break;
            }
        }while (edad > 0);
        System.out.println("La suma de las edades es: " + suma + ". La cantidad de edades ingresadas fueron: " + contador);
        System.out.println("El promedio es igual a: " + promedio);
        if (promedio >25 ){
            System.out.println("El promedio fue mayor que 25 y ha finalizado");
    } else{
            System.out.println("Reinicia el programa ya que el promedio no fue superior a 25");
        }
}

}