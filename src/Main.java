import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a este ejercicio.");
        System.out.println("A continuación, ingresa los datos de la cuenta:");
        System.out.println("Titular de la cuenta: ");
        String titular = sc.nextLine();

        Cuenta cuenta1 = new Cuenta(titular);
        int accion;
        do {
            menu();
            accion = sc.nextInt();
            opcionMenu(accion, cuenta1);
        } while (accion!=3);

    }

    //Los métodos de esta clase deben crearse fuera del método main.

    //Método menú. (Estático, debido a que un método estatico solo puede llamar a otro método estático.)
    public static void menu(){
        System.out.println("Ingresa '1' si deseas ingresar, '2' si deseas retirar, o '3' si deseas salir de la aplicación.");

    }

    //Metodo de las opciones del menú.
    public static void opcionMenu(int accion, Cuenta cuenta1){
        Scanner sc = new Scanner(System.in);
        if (accion == 1){
            System.out.println("Ingresa la cantidad que deseas ingresar: ");
            double cantidad = sc.nextDouble();
            cuenta1.ingresar(cantidad);
            cuenta1.mostrar();
        } else if (accion==2) {
            System.out.println("Ingresa la cantidad que deseas retirar: ");
            double cantidad = sc.nextDouble();
            cuenta1.retirar(cantidad);
            cuenta1.mostrar();
        } else if (accion==3){
        }
    }
}
