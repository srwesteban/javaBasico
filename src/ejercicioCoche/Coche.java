package ejercicioCoche;

public class Coche {


    int puertas;

    public Coche(int numeroPuertas) {
        this.puertas =numeroPuertas;
    }

    public int incrementoPuertas(int incrementoPuertas){

        this.puertas += incrementoPuertas;
        return puertas;
    }



}
