package misejercicios;

import java.util.Scanner;
import misejercicios.modelo.Cuenta;

public class MiEjercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a este ejercicio.");
        System.out.println("A continuaci3n, ingresa los datos de la cuenta:");
        System.out.println("Titular de la cuenta: ");
        Cuenta cuenta1 = new Cuenta(sc.nextLine());
        int accion;
        do {
            System.out.println("Ingresa '1' si deseas ingresar, '2' si deseas retirar, o '3' si deseas salir de la aplicación.");
            accion = sc.nextInt();
            opcionMenu(accion, cuenta1);
        }
        while (accion != 3);
        sc.close();
    }

    //Los métodos de esta clase deben crearse fuera del método main.

    //Metodo de las opciones del menú.
    public static void opcionMenu(int accion, Cuenta cuenta1) {
        Scanner sc = new Scanner(System.in);
        switch (accion) {
            case 1:
                System.out.println("Ingresa la cantidad que deseas ingresar: ");
                cuenta1.ingresar(sc.nextDouble());
                cuenta1.mostrar();
                break;
            case 2:
                System.out.println("Ingresa la cantidad que deseas retirar: ");
                cuenta1.ingresar(sc.nextDouble());
                cuenta1.mostrar();
                break;
            case 3:
                System.out.println("Fin de programa...");
                break;
            default:
                System.out.println("Ingrese una opci�n valida...");
                break;
        }
    }
}
