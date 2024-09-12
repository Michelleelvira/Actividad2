import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Especialidad> especialidades = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt(); // Lee la opción del usuario
            scanner.nextLine(); // Analiza la nueva línea

            switch (opcion) {
                case 1:
                    AgregarEspecialidad();
                    break;
                case 2:
                    MostrarEspecialidades();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opcion != 3); // El menú se repetirá hasta que el usuario elija salir
    }

    // Método para mostrar el menú
    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Agregar Especialidad");
        System.out.println("2. Mostrar Especialidades");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para agregar una nueva especialidad
    private static void AgregarEspecialidad() {
        System.out.print("Ingrese el nombre de la especialidad: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese una descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese la duración en semestres: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        List<String> a signaturas = new ArrayList<>();
        String asignatura;

        // Ciclo para agregar asignaturas a la especialidad
        do {
            System.out.print("Ingrese una asignatura (o 'salir' para finalizar): ");
            asignatura = scanner.nextLine();
            if (!asignatura.equalsIgnoreCase("salir")) {
                asignaturas.add(asignatura);
            }
        } while (!asignatura.equalsIgnoreCase("salir"));

        // Crear la especialidad y agregarla a la lista
        Especialidad nuevaEspecialidad = new Especialidad(nombre, descripcion, asignaturas, duracion);
        especialidades.add(nuevaEspecialidad);

        System.out.println("Especialidad agregada exitosamente.");
    }

    // Método para mostrar todas las especialidades
    private static void MostrarEspecialidades() {
        if (especialidades.isEmpty()) {
            System.out.println("No hay especialidades registradas.");
        } else {
            System.out.println("\n--- Especialidades Registradas ---");
            for (Especialidad especialidad : especialidades) {
                especialidad.mostrarInformacion();
                System.out.println(); // Espacio entre especialidades
            }
        }
    }
}