import java.util.List;

public class Clasealumno {
    // estos son mis atributos
    private String nombre;
    private String numeroControl;
    private String carrera;
    private int edad;
    private String correoInstitucional;
    private String telefono;
    private String direccion;
    private String genero;
    private double promedio;
    private List<Materia> materiasInscritas;
    private int creditosAcumulados;

    // este es mi constructor
    public Clasealumno() {
    }


    public Clasealumno (String nombre, String numeroControl, String carrera, int edad,
                       String correoInstitucional, String telefono, String direccion,
                       String genero, double promedio, List<Materia> materiasInscritas, int creditosAcumulados) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.carrera = carrera;
        this.edad = edad;
        this.correoInstitucional = correoInstitucional;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.promedio = promedio;
        this.materiasInscritas = materiasInscritas;
        this.creditosAcumulados = creditosAcumulados;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public List<Materia> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(List<Materia> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    // Método para mostrar información del alumno
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de Control: " + numeroControl);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Institucional: " + correoInstitucional);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("Género: " + genero);
        System.out.println("Promedio: " + promedio);
        System.out.println("Créditos Acumulados: " + creditosAcumulados);
    }
}
