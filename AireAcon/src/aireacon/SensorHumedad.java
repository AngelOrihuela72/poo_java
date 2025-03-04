
package aireacon;


public class SensorHumedad {
    private double humedad;

    public SensorHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getHumedad() {
        return humedad;
    }

    public void actualizarHumedad() {
        humedad = 40 + Math.random() * 40;
    }
}
