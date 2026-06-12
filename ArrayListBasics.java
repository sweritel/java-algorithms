import java.util.List;
import java.util.ArrayList;

/**
 * Ejemplos de uso y ejercicios de la API de Java Collections Framework (List / ArrayList).
 */
class Main {
    public static void main(String[] args) {
        
        // 1. CREACIÓN E INICIALIZACIÓN
        // Uso de interfaz como tipo de referencia y el operador diamante (<>) por inferencia de tipos
        List<String> lista = new ArrayList<>(); 
        lista.add("Andres");
        lista.add("Rosa");
        lista.add("Marcos");
        lista.add("Diego");
        lista.add("Maria");
        lista.add("Juan");
        lista.add("Juan");
        lista.add("Diego");
        System.out.println("Lista inicial: " + lista);

        // 2. LECTURA DE ELEMENTOS (get)
        String nombre = lista.get(0);
        System.out.println("Elemento en indice 0: " + nombre);
        String elemento2 = lista.get(1);
        System.out.println("Elemento en indice 1: " + elemento2);

        // 3. MODIFICACIÓN DE ELEMENTOS (set)
        // .set() reemplaza el elemento y devuelve el valor previo en esa posición
        String propiset = lista.set(0, "Estrella");
        System.out.println("Elemento reemplazado: " + propiset); 
        System.out.println("Lista modificada: " + lista);
        
        // 4. ELIMINACIÓN DE ELEMENTOS (remove)
        // remove(Object) busca la primera ocurrencia, la elimina y devuelve un booleano (optimiza la doble búsqueda)
        if (lista.remove("Maria")) {
            System.out.println("Maria fue eliminada");
        } else {
            System.out.println("No fue eliminada");
        }
        
        // remove(int index) elimina por posición y desplaza los elementos restantes a la izquierda
        lista.remove(0);
        System.out.println("Lista tras remove(0): " + lista);
        
        // 5. RECORRIDO DE LA LISTA
        System.out.println("--- Recorrido del ArrayList ---");
        for (int i = 0 ; i < lista.size(); i++){
            System.out.println("Indice " + i + ": " + lista.get(i));
        }
        System.out.println("-------------------------------");
        
        // 6. BÚSQUEDA Y VALIDACIÓN (contains / indexOf)
        boolean existe = lista.contains("Diego"); 
        if (existe){
            // indexOf devuelve el índice de la primera ocurrencia (de izquierda a derecha)
            int posicion = lista.indexOf("Diego");
            System.out.println("Diego se encuentra en la posicion: " + posicion);
        }
        
        // 7. LIMPIEZA Y VERIFICACIÓN DE ESTADO (clear / isEmpty)
        lista.clear(); // Remueve todos los elementos
        System.out.println("Lista tras clear(): " + lista);  
        System.out.println("¿La lista esta vacia?: " + lista.isEmpty());  
        
        
        // =========================================================================
        // SECCIÓN DE EJERCICIOS DE LÓGICA
        // =========================================================================
        
        System.out.println("\n--- Ejecutando Ejercicios de Logica ---");

        // Ejercicio 1: El juego de las posiciones (Fácil)
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add(0, "Luis"); // Inserta en 0 y desplaza el resto
        nombres.add("Sofia");
        nombres.add(2, "Pedro"); // Inserta en 2 y desplaza el resto
        
        // Resultado esperado de izquierda a derecha: [Luis, Carlos, Pedro, Ana, Sofia]
        System.out.println("Ej 1 - Lista final: " + nombres);
        // nombres.get(3) devuelve "Ana"
        System.out.println("Ej 1 - Elemento en indice 3: " + nombres.get(3));
        
        // Ejercicio 2: El rastreador (Intermedio)
        List<Character> lista2 = new ArrayList<>(List.of('A', 'B', 'C', 'A', 'D'));
        System.out.println("Ej 2 - Lista: " + lista2);
        
        int pos = lista2.indexOf('C');
        System.out.println("Ej 2 - Index de 'C': " + pos); // Primera ocurrencia encontrada
        
        int pos2 = lista2.indexOf('Z');
        System.out.println("Ej 2 - Index de 'Z': " + pos2); // Devuelve -1 porque no existe
        
        lista2.clear();
        System.out.println("Ej 2 - ¿Vacia tras clear()?: " + lista2.isEmpty());
        
        // Ejercicio 3: Lógica Condicional (Intermedio)
        List<String> colores = new ArrayList<>(List.of("Rojo", "Verde", "Azul"));
        System.out.println("Ej 3 - Lista inicial: " + colores);
        
        if (colores.contains("Negro")) { 
            colores.add(1, "Blanco");
        } else {
            colores.add(0, "Amarillo"); // Entra aqui por ausencia de "Negro"
        }
        
        if (!colores.isEmpty()) {
            colores.add("Gris"); // Agrega al final de la lista
        }
        // Resultado esperado: [Amarillo, Rojo, Verde, Azul, Gris]
        System.out.println("Ej 3 - Lista final: " + colores);

        // Ejercicio 4: El código misterioso (Avanzado)
        List<Character> datos = new ArrayList<>(List.of('X', 'Y', 'Z'));
        System.out.println("Ej 4 - Lista inicial: " + datos);
        
        // La siguiente linea lanza IndexOutOfBoundsException en tiempo de ejecucion.
        // No se puede insertar en el indice 5 porque excede el tamaño actual (size + 1) de la lista.
        // datos.add(5, 'W'); 
        System.out.println("Ej 4 - Comentado para evitar el colapso del programa (IndexOutOfBoundsException).");
        
    } // Fin del metodo main
} // Fin de la clase Main
