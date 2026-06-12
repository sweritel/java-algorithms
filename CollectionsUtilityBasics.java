import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. INICIALIZACIÓN Y BASE DE DATOS
        // ==========================================
        List<String> lista = new ArrayList<>();
        lista.add("Andres");
        lista.add("Rosa");
        lista.add("Maria");
        lista.add("Marcos");
        lista.add("Juan");
        lista.add("Marcos");
        lista.add("Diego");
        
        System.out.println("Lista Base: " + lista);
        
        // ==========================================
        // 2. ORDENAMIENTO (NATURAL VS PERSONALIZADO)
        // ==========================================
        
        // Orden Natural: Utiliza el orden por Unicode, de menor a mayor (A -> Z).
        // Internamente requiere que los objetos implementen la interfaz Comparable (compareTo).
        Collections.sort(lista);
        System.out.println("Orden Natural (Ascendente): " + lista);
        
        // Orden Personalizado: Invierte el criterio usando un Comparator (reverseOrder).
        // Ordena según Unicode de mayor a menor (Z -> A).
        Collections.sort(lista, Collections.reverseOrder()); 
        System.out.println("Orden Inverso (Z -> A): " + lista);
        
        // REGLA CLAVE: No existe 'Collections.sort(lista, Collections.reverse())' 
        // porque sort requiere un criterio de comparación (Comparator), no una acción física.

        // ==========================================
        // 3. ALTERACIÓN FÍSICA (SHUFFLE Y REVERSE)
        // ==========================================
        
        // Mezclar elementos de forma aleatoria (Útil en simulaciones/criptografía básica)
        Collections.shuffle(lista);
        System.out.println("Lista Mezclada (Shuffle): " + lista);
        
        // Invierte el orden físico actual de los elementos (Efecto Espejo)
        // REGLA CLAVE: Modifica la lista original directamente, va solo sin asignación (=).
        Collections.reverse(lista);
        System.out.println("Lista Invertida (Reverse): " + lista);
        
        // ==========================================
        // 4. BÚSQUEDA (BINARY SEARCH)
        // ==========================================
        
        // Intento de búsqueda en lista desordenada (Produce resultados erróneos/negativos)
        int posicionInvalida = Collections.binarySearch(lista, "Rosa");
        System.out.println("Busqueda en desorden (Resultado impredecible): " + posicionInvalida); 
        
        // Solución Correcta: Primero ordenar, luego buscar matemáticamente
        Collections.sort(lista);
        int posicionValida = Collections.binarySearch(lista, "Rosa");
        System.out.println("Busqueda en lista ordenada (Posición Real): " + posicionValida); 

        // ==========================================
        // 5. CÁLCULO DE MÁXIMOS, MÍNIMOS Y FRECUENCIAS
        // ==========================================
        Collections.shuffle(lista); // Volvemos a desordenar para probar que max/min funcionan igual
        
        // Elemento Máximo: Basado en orden lexicográfico (La Z es mayor que la A)
        String maximo = Collections.max(lista);
        System.out.println("Elemento Máximo (Último en el abecedario): " + maximo); // Rosa
        
        // Elemento Mínimo: El de menor valor numérico Unicode
        String minimo = Collections.min(lista);
        System.out.println("Elemento Mínimo (Primero en el abecedario): " + minimo); // Andres
        
        // Contar apariciones de un elemento específico
        int veces = Collections.frequency(lista, "Marcos");
        System.out.println("Frecuencia: 'Marcos' aparece " + veces + " veces");
        
        // ==========================================
        // 6. MODIFICACIÓN Y REEMPLAZO
        // ==========================================
        
        // Reemplazar todas las ocurrencias de un valor por otro
        Collections.replaceAll(lista, "Marcos", "Carlos");
        System.out.println("Lista tras replaceAll (Marcos -> Carlos): " + lista);

        // ==========================================
        // 7. COPIAR Y DUPLICAR COLECCIONES
        // ==========================================
        
        // Forma segura de clonar/copiar una lista en otra pasándole la estructura de origen
        List<String> listaB = new ArrayList<>(lista); 
        System.out.println("Copia exacta (Lista B): " + listaB);
        
        /* // Opcional: Rellenar toda la colección con un mismo elemento fijo
        Collections.fill(lista, "Carlos");
        System.out.println("Lista Rellena (Fill): " + lista);
        */
        
    } // Cierre de main
} // Cierre de clase Main
