
package aireacon;

public class AireAcon {


    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura(25.0); // Temperatura inicial de 25°C
        SensorHumedad sensorHumedad = new SensorHumedad(50.0); // Humedad inicial del 50%
        ControlAire aireAcondicionado = new ControlAire();
        
         while (true) {
            sensorTemperatura.actualizarTemperatura();
            sensorHumedad.actualizarHumedad();

            double temperatura = sensorTemperatura.getTemperatura();
            double humedad = sensorHumedad.getHumedad();

            System.out.println("Temperatura: " + temperatura + "°C");
            System.out.println("Humedad: " + humedad + "%");


            aireAcondicionado.controlar(temperatura, humedad);

            aireAcondicionado.mostrarEstado();

            try {
                Thread.sleep(10000); // 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    
