
package calculadorasimple;

public class OperarDivi {
    
    private int num1, num2;
    
    public void setNumerosdivi(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void operarDivi(){
        int divi = num1 / num2;
        System.out.println("la division es: " + divi);
    }
    
}
