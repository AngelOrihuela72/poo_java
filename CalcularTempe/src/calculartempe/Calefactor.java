
package calculartempe;


public class Calefactor {
     private boolean encendido;


    public Calefactor() {
        this.encendido = false;
    }


    public void controlar(double temperatura) {
        if (temperatura < 10) {
            encendido = true;  
        } else {
            encendido = false;
        }
    }


    public void mostrarEstado() {
        if (encendido) {
            System.out.println("El calefactor esta encendido");
        } else {
            System.out.println("El calefactor esta apagado");
        }
    }
}
