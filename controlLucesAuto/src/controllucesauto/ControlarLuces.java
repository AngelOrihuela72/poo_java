
package controllucesauto;

public class  ControlarLuces {
    private boolean lucesEncendidas;

    public void controlarLuces(boolean esDeNoche, boolean hayMovimiento) {
        if (esDeNoche && hayMovimiento) {
            lucesEncendidas = true;
        } else {
            lucesEncendidas = false;
        }
    }

    public boolean getEstadoLuces() {
        return lucesEncendidas;
    }

    public void mostrarEstado() {
        if(lucesEncendidas){
            System.out.println("Las luces estan encendidas");
        } else {
            System.out.println("Las luces estan apagadas");
        }
    }
}