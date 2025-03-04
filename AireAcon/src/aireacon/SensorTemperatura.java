
package aireacon;


    public class SensorTemperatura {
    private double temperatura;

    public SensorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void actualizarTemperatura() {
        temperatura = 20 + Math.random() * 15;
    }

}
