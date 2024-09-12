import java.util.List;

public class ClaseGrupo {
    private String nombreGrupo;
    private String nombreProfesorEncargado;
    private List<Clasealumno> alumnosInscritos;
    private String materia;


    public ClaseGrupo() {
    }


    public ClaseGrupo(String nombreGrupo, String nombreProfesorEncargado, List<Clasealumno> alumnosInscritos, String materia) {
        this.nombreGrupo = nombreGrupo;
        this.nombreProfesorEncargado = nombreProfesorEncargado;
        this.alumnosInscritos = alumnosInscritos;
        this.materia = materia;
    }

    // Getters y Setters

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getNombreProfesorEncargado() {
        return nombreProfesorEncargado;
    }

    public void setNombreProfesorEncargado(String nombreProfesorEncargado) {
        this.nombreProfesorEncargado = nombreProfesorEncargado;
    }

    public List<Clasealumno> getAlumnosInscritos() {
        return alumnosInscritos;
    }

    public void setAlumnosInscritos(List<Clasealumno> alumnosInscritos) {
        this.alumnosInscritos = alumnosInscritos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Método para mostrar información del grupo
    public void mostrarInfoGrupo() {
        System.out.println("Nombre del Grupo: " + nombreGrupo);
        System.out.println("Profesor Encargado: " + nombreProfesorEncargado);
        System.out.println("Materia: " + materia);

        System.out.println("Alumnos Inscritos:");
        if (alumnosInscritos.isEmpty()) {
            System.out.println("No hay alumnos inscritos en este grupo.");
        } else {
            for (Clasealumno alumno : alumnosInscritos) {
                alumno.mostrarInfo();
                System.out.println("---------------------------");
            }
        }
    }
}