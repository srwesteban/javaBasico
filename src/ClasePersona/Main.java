package ClasePersona;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Ana");
        cliente.setTelefono("123456789");
        cliente.setCredito(5000);

        System.out.println("Datos del cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("987654321");
        trabajador.setSalario(2500.50);

        System.out.println("Datos del trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());

    }
}
