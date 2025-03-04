
package calculartempe;

public class Ventilador {
    
    private boolean encendido;


    public Ventilador() {
        this.encendido = false;
    }


    public void controlar(double temperatura) {
        if (temperatura > 25) {
            encendido = true; 
        } else {
            encendido = false; 
        }
    }


    public void mostrarEstado() {
        if (encendido) {
            System.out.println("El ventilador esta encendido");
        } else {
            System.out.println("El ventilador esta apagado");
        }
    }

    
}
