
package deteccionintrusos;

import java.util.Random;
import java.util.Scanner;

public class DeteccionIntrusos {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        boolean noche = false;
        
        
        while(true){
            System.out.println("1. Activar alarma");
            System.out.println("2. Desactivar alarma");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            int opcion = entrada.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Es de noche?");
                    System.out.println("si/no");
                    String esDeNoche = entrada.next().trim().toLowerCase();
                    noche = esDeNoche.equals("si");
                    
                    boolean sensor1 = random.nextBoolean();
                    boolean sensor2 = random.nextBoolean();
                    boolean sensor3 = random.nextBoolean();
                    
                    System.out.println("Lectura de sensores:\nSensor 1: " + sensor1 + "\nSensor 2: " + sensor2 + "\nSensor 3: " + sensor3);
                    
                    if(MenuAlarma.activarAlarma(sensor1, sensor2, sensor3, noche)){
                        System.out.println("Alarma activada");
                    } else {
                        System.out.println("Alarma no activada");
                    }
                    break;
                
                case 2:
                    System.out.println("Alarma desactivada");
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    entrada.close();
                    return;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    
}
