
package controllucesauto;

public class ControlLucesAuto {
    public static void main(String[] args) {
        ControlarLuces sistema = new ControlarLuces();
        boolean esDeNoche;
        boolean hayMovimiento;

        while (true) {

            esDeNoche = Math.random() < 0.5; 
            hayMovimiento = Math.random() < 0.5;  

            sistema.controlarLuces(esDeNoche, hayMovimiento);

            sistema.mostrarEstado();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}