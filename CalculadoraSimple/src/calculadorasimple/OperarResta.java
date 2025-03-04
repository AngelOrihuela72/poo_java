
package calculadorasimple;


public class OperarResta{
    
    private int num1, num2;
    
    public void setNumerosresta(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void operarResta(){
        int resta = num1 - num2;
        System.out.println("la resta es: " + resta);
    }
    
}
