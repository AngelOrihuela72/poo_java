
package juegofizzbuzz;


public class MenuOperador {
    
    public void operarDatos(int num){
        for (int i=1; i<=100; i++){
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz"); 
                break;
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
                break;
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
                break;
            } else {
                System.out.println( "el numero ingresado fue: "+num);
                break;
            }
}
    }
    
}