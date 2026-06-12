
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        String firmaSensible = "CONEXION_REVERSA";
        System.out.println("1. Texto Original: " + firmaSensible);
        
        esperar(1000); 

        List<String> payload = new ArrayList<>();
        
        System.out.println("\n--- Cargando payload en caracteres ---");
        for (char i : firmaSensible.toCharArray()) {
            payload.add(String.valueOf(i));
            System.out.println(payload);
            esperar(200); 
        }
        
        esperar(800);
        Collections.reverse(payload);
        System.out.println("\nMetodo reverse: " + payload);
        
        esperar(800);
        long claveSecreta = 999L;
        Collections.shuffle(payload, new Random(claveSecreta));
        System.out.println("2. En Memoria (Mezcla): " + payload);
    
        esperar(1000);
        List<Integer> posiciones = new ArrayList<>();
        for (int i = 0; i < payload.size(); i++) {
            posiciones.add(i);
        }
        
        Collections.shuffle(posiciones, new Random(claveSecreta));

        System.out.println("\n--- Iniciando Reconstruccion Criptografica ---");
        String[] reconstruido = new String[payload.size()];
        for (int i = 0; i < payload.size(); i++) {
            reconstruido[posiciones.get(i)] = payload.get(i);
            
            String progresoVisual = armarProgreso(reconstruido);
            System.out.println("Desofuscando paso [" + i + "]: " + progresoVisual);
            
            esperar(400);
        }

        List<String> listaCasiLista = new ArrayList<>(List.of(reconstruido));
        Collections.reverse(listaCasiLista);

        esperar(800);
        String resultadoFinal = String.join("", listaCasiLista);
        System.out.println("\n3. Texto Reconstruido Exitosamente: " + resultadoFinal);
    }

  
    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static String armarProgreso(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            if (s == null) {
                sb.append("_");
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
