
package calculadorasimple;

import java.util.Scanner;


public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("ingrese la opcion de la operacion a realizar: ");
        System.out.println("1. SUMA\n2. RESTA\n3. MULTIPLICACION\n4. DIVISION");
        int opcion = entrada.nextInt();

        
            switch (opcion){
            case 1:
                OperarSuma calcSuma = new OperarSuma();
                calcSuma.setNumerossuma(num1, num2);
                calcSuma.operarSuma();
                break;
            case 2:
                OperarResta calcResta = new OperarResta();
                calcResta.setNumerosresta(num1, num2);
                calcResta.operarResta();
                break;
            case 3:
                OperarMulti calcMulti = new OperarMulti();
                calcMulti.setNumerosmulti(num1, num2);
                calcMulti.operarMulti();
                break;
            case 4:
                OperarDivi calcDivi = new OperarDivi();
                calcDivi.setNumerosdivi(num1, num2);
                calcDivi.operarDivi();
                break;
            default:
                System.out.println("opcion no valida");
                break;

        }
        
        
    }
    
}
