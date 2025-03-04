
package calculadorasimple;

public class OperarMulti {
    
    private int num1, num2;
    
    public void setNumerosmulti(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void operarMulti(){
        int multi = num1 * num2;
        System.out.println("la multiplicacion es: " + multi);
    }
    
}
