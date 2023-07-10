package EjercicioPersona;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(30);
        persona.setNombre("Juan");
        persona.setTelefono("123456789");

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());


    }
}
