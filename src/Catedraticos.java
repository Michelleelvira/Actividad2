public class Catedraticos {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String departamento;
    private String correoElectronico;
    private String horario;
    private String tipoContrato;
    private int id;
    private int edad;
    private int aniosExperiencia;
    private double salario;

    public Catedraticos(String nombre, String apellido, String especialidad, String departamento,
                        String correoElectronico, String horario, String tipoContrato,
                        int id, int edad, int aniosExperiencia, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.horario = horario;
        this.tipoContrato = tipoContrato;
        this.id = id;
        this.edad = edad;
        this.aniosExperiencia = aniosExperiencia;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Catedraticos{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", horario='" + horario + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                ", aniosExperiencia=" + aniosExperiencia +
                ", salario=" + salario +
                '}';
    }
}