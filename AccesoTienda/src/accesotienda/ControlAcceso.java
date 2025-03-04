
package accesotienda;


public class ControlAcceso {
     private Hora hora;
    

    public ControlAcceso() {
        this.hora = new Hora();
    }


    public boolean verificarAcceso(Cliente cliente) {
        if (cliente.esEmpleado() || (cliente.tieneMembresia() && hora.estaDentroHorarioAtencion())) {
            return true;
        }
        return false;
    }


    public void mostrarAcceso(Cliente cliente) {
        if (verificarAcceso(cliente)) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }

}
