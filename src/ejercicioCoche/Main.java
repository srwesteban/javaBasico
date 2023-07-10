package ejercicioCoche;


public class Main {

    public static void main(String[] args) {

        System.out.println("Primera parte");

        int resultado = sumar(5, 10, 15);
        System.out.println("El resultado de la suma es: " + resultado);

        System.out.println("\nSegunda parte\n");

        Coche coche = new Coche(4);
        System.out.println("el numero de puertas que tiene el coche es: "+coche.puertas);
        coche.incrementoPuertas(2);
        System.out.println("después del incremento el numero de puertas que tiene el coche es: "+coche.puertas);



    }

    private static int sumar(int a, int b, int c) {

        int suma = a+b+c;

        return suma;
    }
}
