import java.util.Scanner;

public class Unidad3Semana4Ejercicio4 {

    public static void main(String[] args) {
        int nota = 0,cont1 = 0,cont2 = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Ingrese la nota del alumno: ");
            nota = teclado.nextInt();
            if (nota >= 7){
                cont1 = cont1 + 1;
            } else if (nota > 0){
                cont2 = cont2 + 1;
            }
        }while (nota != 0);
         System.out.println("La cantidad de alumnos que tienen notas mayores o iguales a 7 son:" + cont1);
         System.out.println("La cantidad de almunos que tienen notas menores a 7 son: " + cont2);
    }

}