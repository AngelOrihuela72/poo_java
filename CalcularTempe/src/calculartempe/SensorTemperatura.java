
package calculartempe;


public class SensorTemperatura {
    private double temperatura;


    public SensorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }


    public double obtenerTemperatura() {
        return temperatura;
    }

    public void actualizarTemperatura() {
        temperatura = -5 + Math.random() * 40;
    }
}
