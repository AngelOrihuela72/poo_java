
package calculartempe;




public class MainTempe {
    public static void main(String[] args) {
        SensorTemperatura sensorTemperatura = new SensorTemperatura(15.0); // Temperatura inicial de 15°C
        Calefactor calefactor = new Calefactor();
        Ventilador ventilador = new Ventilador();

        while (true) {
           
            sensorTemperatura.actualizarTemperatura();

            double temperatura = sensorTemperatura.obtenerTemperatura();


            System.out.println("Temperatura en el invernadero: " + temperatura + "°C");

            calefactor.controlar(temperatura);
            ventilador.controlar(temperatura);

   
            calefactor.mostrarEstado();
            ventilador.mostrarEstado();

            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
