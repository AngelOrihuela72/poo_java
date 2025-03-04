
package accesotienda;


public class AccesoTienda {

    public static void main(String[] args) {
        ControlAcceso sistema = new ControlAcceso();

        Cliente cliente1 = new Cliente(true, false); 
        Cliente cliente2 = new Cliente(false, false); 
        Cliente cliente3 = new Cliente(false, true);  
        
        while (true) {
            System.out.println("Cliente 1:");
            sistema.mostrarAcceso(cliente1);

            System.out.println("Cliente 2:");
            sistema.mostrarAcceso(cliente2);

            System.out.println("Cliente 3:");
            sistema.mostrarAcceso(cliente3);

       
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
    

