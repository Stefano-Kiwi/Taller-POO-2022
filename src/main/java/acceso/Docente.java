package acceso;
import java.time.LocalDate;

/**
 *
 * @author Daniel Altamirano
 */
public class Docente extends Lector {
    
    private String carrera;

    public Docente(String nombre, String apellido, String tipoDocumento, int numDocumento, LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad, String domicilio, int codigoPostal, String departamento, String localidad,String carrera) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad, domicilio, codigoPostal, departamento, localidad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Docente" +super.toString() + "carrera=" + carrera + '}';
    }
}
