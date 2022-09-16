import java.util.Scanner;

public class Unidad1Semana6Clase17Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese clave de usuario: ");
        clave = entrada.nextLine();
        if(nombre.equals("juan") && clave.equals("123456")){
            System.out.println("Bienvenido al Sistema");
    }
        else{
            System.out.println("Nombre de Usuario o Contraseña Incorrectos");
        }
    }
    
}