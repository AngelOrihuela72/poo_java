
package calculadorasimple;

public class OperarSuma {
    
    private int num1, num2;
    
    public void setNumerossuma(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void operarSuma(){
        int suma = num1 + num2;
        System.out.println("la suma es: " + suma);
    }
    
}
