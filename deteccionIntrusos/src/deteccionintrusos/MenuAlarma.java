
package deteccionintrusos;


public class MenuAlarma {
    
    public static boolean activarAlarma(boolean sensor1, boolean sensor2, boolean sensor3, boolean noche) {
        int sensoresActivados = 0;
        if (sensor1) sensoresActivados++;
        if (sensor2) sensoresActivados++;
        if (sensor3) sensoresActivados++;

        return sensoresActivados >= 2 && noche;
    }
}
