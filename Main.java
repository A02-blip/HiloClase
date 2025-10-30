import java.util.Scanner; 
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in); 
        HiloEscribe hilo = null; 
        Posicion posicion = new Posicion();
        String[] arreglo = new String[10]; 
        int opcion = 0;
        
            do{
                try{
                System.out.println("MENÚ");
                System.out.println("1. CREAR HILO"); 
                System.out.println("2. PAUSAR HILO");
                System.out.println("3. CONTINUAR");
                System.out.println("4. TERMINAR");
                System.out.println("5. MOSTRAR ARREGLO");
                System.out.println("6. MOSTRAR ESTADO DEL HILO");
                 opcion = scanner.nextInt();
                 
                   switch(opcion) {
                       case 1:
                           posicion = new Posicion();
                           arreglo = new String[10]; 
                           hilo = new HiloEscribe(posicion); 
                           hilo.setName("bel"); 
                           hilo.setInfo(arreglo); 
                           hilo.setIni(0); 
                           hilo.setTmp(500); 
                           System.out.println("HILO CREADO");
                           hilo.start(); 
                           break; 
                        case 2: 
                            if (hilo != null && hilo.isAlive()) {
                            hilo.pausarHilo(); 
                            System.out.println("HILO PAUSADO"); 
                        } else {
                            System.out.println("HILO NO CREADO"); 
                        }
                        break;
                        case 3: 
                            if(hilo != null && hilo.isAlive()){
                                System.out.println("CONTINUA HILO"); 
                                hilo.continuarHilo(); 
                            }
                            else {
                                System.out.println("HILO INACTIVO");
                            }
                            break; 
                        case 4: 
                             if (hilo != null && hilo.isAlive()) {
                            System.out.println("TERMINANDO HILO");
                            hilo.interrupt();
                            try {
                                hilo.join(1000);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        } else { 
                            System.out.println("HILO INACTIVO");
                        }
                        break; 
                        case 5: 
                            System.out.println("CONTENIDO DEL ARREGLO"); 
                            
                        case 6: 
                            
                   }
                }
            }
    }
}
