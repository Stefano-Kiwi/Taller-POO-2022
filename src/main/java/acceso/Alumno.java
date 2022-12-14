package acceso;

import java.time.LocalDate;

public class Alumno extends Lector {

    private String carrera;
    private String facultad;

    public Alumno(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad, String carrera, String facultad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad, domicilio, codigoPostal, departamento, localidad);
        this.carrera = carrera;
        this.facultad = facultad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Alumno " + "carrera=" + carrera + ", facultad=" + facultad + " " + super.toString();
    }

    /**
     * Este método es utilizado para cargar los datos de los alumnos a un bloc
     * de notas que contiene a todos los lectores
     *
     * @return String
     */
    public String toCSV() {
        LocalDate a = this.getFechaNacimiento();
        int dia = a.getDayOfMonth();
        int mes = a.getMonthValue();
        int anio = a.getYear();
        return "1" + "," + this.getNombre() + "," + this.getApellido() + "," + this.getTipoDocumento() + "," + this.getNumDocumento() + "," + dia + "/" + mes + "/" + anio + "," + this.getSexo() + "," + this.getCorreo() + "," + this.getNroCelular() + "," + this.getNacionalidad() + "," + this.getDomicilio() + "," + this.getCodigoPostal() + "," + this.getDepartamento() + "," + this.getLocalidad() + "," + this.carrera + "," + this.facultad;
    }
}
