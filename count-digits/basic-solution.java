import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Main programa = new Main();

        System.out.println("Bienvenido. Elija una de estas opciones:");
        System.out.println("1. Contar digitos");
        System.out.println("2. Salir");

        int opcion = sc.nextInt();

        switch(opcion){

            case 1:
                System.out.println("¿Desea probar un número? (si/no)");
                String respuesta = sc.next();

                if(respuesta.equalsIgnoreCase("si")){
                    System.out.println("Ingrese un número:");
                    int numero = sc.nextInt();

                    int resultado = programa.cantidadDigitos(numero);
                    System.out.println("Cantidad de dígitos: " + resultado);

                } else {
                    System.out.println("Respuesta no válida");
                }
                break;

            case 2:
                System.out.println("Chao");
                break;

            default:
                System.out.println("Elija una opción válida");
        }

        sc.close();
    }

    public int cantidadDigitos(int numero){

        numero = Math.abs(numero);

        if(numero == 0){
            return 1;
        }

        int contador = 0;

        while(numero > 0){
            contador++;
            numero /= 10;
        }

        return contador;
    }
}
