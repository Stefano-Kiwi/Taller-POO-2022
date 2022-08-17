package acceso;

import java.time.LocalDate;

/**
 *
 * @author stefano
 */

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numDocumento;
    private LocalDate fechaNacimiento;
    private String sexo;
    private String correo;
    private String nroCelular;
    private String nacionalidad;
    private String domicilio;
    private int codigoPostal;
    private String departamento;
    private String localidad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String tipoDocumento, int numDocumento, LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad, String domicilio, int codigoPostal, String departamento, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.correo = correo;
        this.nroCelular = nroCelular;
        this.nacionalidad = nacionalidad;
        this.domicilio = domicilio;
        this.codigoPostal = codigoPostal;
        this.departamento = departamento;
        this.localidad = localidad;
    }
    
}
