
package juegofizzbuzz;


import java.util.Scanner;


public class JuegoFizzBuzz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int num = entrada.nextInt();
        MenuOperador d1 = new MenuOperador();
        d1.operarDatos(num);
    }
}
