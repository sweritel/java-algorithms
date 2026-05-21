import java.util.Scanner;

class Main {
    public static void main (String[] args){
        /*Bloque 1: Rangos con Math.random()
            Ejercicio 1.1.: Genera un número entero aleatorio entre 1 y 6 (inclusive) que simule el lanzamiento de un dado de parchís. Almacena el resultado en una variable entera llamada dado.*/
            
        //Declaraciones y acciones:
        //Math.random(va desde 0.0 y no llega a 1.0)
        //en el caso de dar el valor maximo: 0.9999.
        //(int): operador de casteo: Toma el número decimal que tienes a la derecha y conviértelo a la fuerza en un número entero (int)
        //Mediante la eliminación de decimales
        //5.9994 -> 5
        //5 + 1 = 6; (maximo valor del dado)
        //menor valor del dado = 0:
        int dado = (int)(Math.random() * 6) + 1;
        System.out.println("Numero aleatorio del 1 al 6: " + dado);
        
        //Ejericio 1.2: Declara dos variables enteras: min = 10 y max = 50. Escribe la fórmula usando Math.random() para obtener un número entero aleatorio que esté dentro de ese rango (incluyendo el 10 y el 50).*/
        int min = 10, max = 50;
        //entre 0.0 limite 0.1
        //Máx valor -> 0.9999
        //fórmula: int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
        
        int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Numero aleatorio entre 10 y 50: " + aleatorio);
        
        /* Bloque 2: Potencias y Raíces con Math.pow() y Math.sqrt()
            Ejercicio 2.1: El Área del Círculo
                Reto: Tienes un radio double radio = 4.5;
                Calcula el área del círculo usando la fórmula Área = pi * r^2
                .Nota: Usa Math.PI para el valor de pi y Math.pow() para elevar el radio al cuadrado.*/
        //El valor estático de la constante PI es = 3.141592653589793
        System.out.println("valor exacto de la constante matematica PI: " + Math.PI);
        double radio= 4.5;
        double area = (Math.PI) * (Math.pow(radio, 2));
        System.out.println("area exacta: " + area);
        
        //Ahora vamos a redondearlo al más cercando 
        double decimales = Math.round(area); 
        System.out.println("Redondeado al entero mas cercano: " + decimales);
        
        //Ahora vamos a redondearlo usando dos decimale.
        double respuesta = Math.round(area * 100.0) / 100.0;
        System.out.println("A dos decimales: " + respuesta);
        //64.0 * 100.0 -> 6400.0 / 100.0 -> 64.0
        
        //Vamos a redondearlo solo con Rint() para obtener el entero mas cercano en forma de decimal.
        double redondeado = Math.rint(area);
        System.out.println("numero entero mas cercano pero te lo devuelve estrictamente con el formato de tipo de dato double: " + redondeado);
        
        //nota adicional:
        /* Conclusión de los dos 64.0: Ambos redondean 63.61 al entero más cercano (64).
           Math.round da 64 entero, pero sale .0 porque lo guardamos en un double.
           Math.rint da 64.0 porque este método ya devuelve un double por defecto. */
           
        /*
        Ejercicio 2.2: Teorema de Pitágoras
        Reto: Tienes los catetos de un triángulo rectángulo: double catetoA = 3.0; y double catetoB = 4.0;. Calcula la hipotenusa usando la fórmula h= √(a^2 + b ^ 2). Nota: Combina Math.sqrt() y Math.pow().
        */
        
        double catetoA = 3.0;
        double catetoB = 4.0;
        
        double suma = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        System.out.println("La suma de los cuadrados es: " + suma);
       
        // Math.sqrt() calcula la raíz cuadrada de 25.0, lo que nos da 5.0
        double hipotenusa = Math.sqrt(suma);
        System.out.println("La hipotenusa en double es: " + hipotenusa);
        
        // Para truncar en Java usamos el casteo (int) que elimina los decimales a la fuerza
        int hipotenusaEntero = (int) hipotenusa;
        System.out.println("La h en entero es: " + hipotenusaEntero);
        
        /*
        Bloque 3: Comparaciones con Math.max() y Math.min()
        
        Ejercicio 3.1: El Mayor de Tres
        
        Reto: Tienes tres variables: int a = 15;, int b = 28; y int c = 19;. Encuentra el número mayor de los tres utilizando únicamente la función Math.max() de forma anidada (una dentro de otra) en una sola línea.
        */
        
        int a = 15, b = 28, c = 19;
        //el método max solo admite 2 párametros
        int numMax = Math.max(a, Math.max(b, c));
        System.out.println("El numMayor es: " + numMax);
        
        /*
        Ejercicio 3.2: El Rango de Control
        Reto: Te dan un puntaje int puntaje original = 120;. Quieres asegurarte de que el puntaje final nunca supere el límite máximo de 100. Usa Math.min() para asignar a una nueva variable puntajeFinal el valor correcto (si pasa de 100, se queda en 100).
        */
        // Configuración del Scanner para leer el teclado
        Scanner sc = new Scanner(System.in);
        int numUsuario = 0;
        int limiteMaximo = 100;
        
        System.out.print("Escriba su puntaje: ");
        numUsuario = sc.nextInt();
        int puntajeFinal = Math.min(Math.max(0, numUsuario), 100);
        System.out.println("Su puntaje final es: " + puntajeFinal);
        sc.close();
    }
}
