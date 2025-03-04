
package aireacon;

public class ControlAire {
    private boolean encendido;

    public ControlAire() {
        this.encendido = false;
    }

    public void controlar(double temperatura, double humedad) {
        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encendido = true;
        } else {
            encendido = false;
        }
    }


    public void mostrarEstado() {
        if (encendido) {
            System.out.println("El aire acondicionado esta encendido");
        } else {
            System.out.println("El aire acondicionado esta apagado");
        }
    }
}
