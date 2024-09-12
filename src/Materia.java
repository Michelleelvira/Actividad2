import java.util.ArrayList;
import java.util.List;
//Nombre: ps el nombre de la materia
//Profesor: es el que da la materia
//Modalidad: es el tipo (ya sea si es en linea o presencial)
//Creditos: son los creditos que vale la materia (lo tome como el de nosotros, de que segun tal materia valen 5 creditos y asi)
//El cupo maximo: igual lo tome como el de nosotros, ya que cuanto llegan al cupo maximo cierran el grupo.
//Horario: es el horario que imparte la materia
//Requisitos: es tipo si tiene cadena con alguna otra materia, si no pasaste la anterior a esa no la puedes tomar
//Abierta: es si la clase aun sigue disponible o no
// TODAVIA NO SE SI SE QUEDARAN TODOS ESTOS ATRIBUTOS

public class Materia {
    private String nombre, profesor, modalidad;
    private int creditos, cupoMaximo;
    private List<String> horarios, requisitos;
    private boolean abierta;


    public Materia(String nombre, String profesor, int creditos, List<String> horarios,
                   List<String> requisitos, String modalidad, int cupoMaximo) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
        this.horarios = horarios;
        this.requisitos = requisitos;
        this.modalidad = modalidad;
        this.cupoMaximo = cupoMaximo;
        this.abierta = true; // Por defecto, la materia está abierta
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        if (creditos <= 0) {
            throw new IllegalArgumentException("El número de créditos debe ser positivo.");
        }
        this.creditos = creditos;
    }

    public List<String> getHorarios() {
        return horarios;
    }
    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }

    public List<String> getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public String getModalidad() {
        return modalidad;
    }
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }
    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public boolean isAbierta() {
        return abierta;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", creditos=" + creditos +
                ", horarios=" + horarios +
                ", requisitos=" + requisitos +
                ", modalidad='" + modalidad + '\'' +
                ", cupoMaximo=" + cupoMaximo +
                ", abierta=" + abierta +
                '}';
    }
}

