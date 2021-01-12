public class Cuenta {
    //Atributos
    private String titular;
    private double cantidad;

    //Métodos

    //Método constructor
    public Cuenta(String titular) {
        this.titular = titular;
    }


    //Getters & Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void mostrar() {
        System.out.println("Los datos de la cuenta son:");
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: $"+cantidad);
    }

    public void ingresar(double cantidad){
        if (cantidad<0){
            System.out.println("El valor es negativo, no se modificó el saldo.");
        } else {
            this.cantidad += cantidad;
            System.out.println("Se ingresó el valor de $" + cantidad + ", el nuevo saldo es: $" + this.cantidad);
        }
    }

    public void retirar(double cantidad){
        if (this.cantidad-cantidad>0){
            this.cantidad-=cantidad;
            System.out.println("Se retiraron $"+cantidad+" de la cuenta, el nuevo saldo es: $"+this.cantidad);
        } else{
            System.out.println("Estás en números rojo, cuidado!");
        }

    }


}
